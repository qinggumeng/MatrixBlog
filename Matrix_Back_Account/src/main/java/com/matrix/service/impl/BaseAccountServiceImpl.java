package com.matrix.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.matrix.dao.AccountMapper;
import com.matrix.pojo.Account;
import com.matrix.pojo.AccountExample;
import com.matrix.service.AccountService;

public abstract class BaseAccountServiceImpl implements AccountService {

	@Autowired
	private AccountMapper mapper;
	
	@Override
	public Account findOne(String id) {
		return mapper.selectByPrimaryKey(Long.valueOf(id));
	}

	@Override
	public List<Account> search(AccountExample criteria) {
		return mapper.selectByExample(criteria);
	}

	@Override
	public List<Account> findAll() {
		AccountExample example = new AccountExample();
		return mapper.selectByExample(example);
	}

	@Override
	public Page<Account> findPageByConditon(AccountExample e, Integer currPage, Integer pageRows) {
		PageHelper.startPage(currPage, pageRows);
		return (Page<Account>) mapper.selectByExample(e);
	}

	@Override
	public Account save(Account entity) {
		mapper.insertSelective(entity);
		return entity;
	}

	@Override
	public List<Account> save(List<Account> entities) {
		for (Account account : entities) {
			mapper.insertSelective(account);
		}
		return entities;
	}

	@Override
	public Account update(Account entity) {
		mapper.updateByPrimaryKey(entity);
		return entity;
	}

	@Override
	public List<Account> update(List<Account> entities) {
		for (Account account : entities) {
			mapper.updateByPrimaryKeySelective(account);
		}
		return entities;
	}

	@Override
	public void delete(String id) {
		mapper.deleteByPrimaryKey(Long.valueOf(id));
	}

	@Override
	public boolean exists(String id) {
		Account account = mapper.selectByPrimaryKey(Long.valueOf(id));
		if (account == null)
			return false;
		else
			return true;
	}

	@Override
	public long count() {
		return mapper.countByExample(new AccountExample());
	}

	@Override
	public long countByCondition(AccountExample e) {
		return mapper.countByExample(e);
	}

}
