package com.matrix.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.matrix.dao.ContentMapper;
import com.matrix.pojo.Content;
import com.matrix.pojo.ContentExample;
import com.matrix.service.ContentService;
/**
 * 文章基本业务接口实现类
 * @author JasonFu
 * @createTime 2018年9月6日 下午2:03:05
 */
public class BaseContentServiceImpl implements ContentService {
	
	@Autowired
	private ContentMapper mapper;

	@Override
	public Content findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Content> search(ContentExample criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Content> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Content> findPageByConditon(ContentExample e, Integer currPage, Integer pageRows) {
		PageHelper.startPage(currPage, pageRows);
		return (Page<Content>) mapper.selectByExample(e);
	}

	@Override
	public Content save(Content entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Content> save(List<Content> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Content update(Content entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Content> update(List<Content> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long countByCondition(ContentExample e) {
		// TODO Auto-generated method stub
		return 0;
	}

}
