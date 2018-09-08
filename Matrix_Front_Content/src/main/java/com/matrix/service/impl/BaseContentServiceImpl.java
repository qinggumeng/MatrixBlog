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
		return mapper.selectByPrimaryKey(Long.valueOf(id));
	}

	@Override
	public List<Content> search(ContentExample criteria) {
		return mapper.selectByExample(criteria);
	}

	@Override
	public List<Content> findAll() {
		return mapper.selectByExample(new ContentExample());
	}

	@Override
	public Page<Content> findPageByConditon(ContentExample e, Integer currPage, Integer pageRows) {
		PageHelper.startPage(currPage, pageRows);
		return (Page<Content>) mapper.selectByExample(e);
	}

	@Override
	public Content save(Content entity) {
		mapper.insertSelective(entity);
		return entity;
	}

	@Override
	public List<Content> save(List<Content> entities) {
		for (Content content : entities) {
			mapper.insertSelective(content);
		}
		return entities;
	}

	@Override
	public Content update(Content entity) {
		mapper.updateByPrimaryKeySelective(entity);
		return entity;
	}

	@Override
	public List<Content> update(List<Content> entities) {
		for (Content content : entities) {
			mapper.updateByPrimaryKeySelective(content);
		}
		return entities;
	}

	@Override
	public void delete(String id) {
		mapper.deleteByPrimaryKey(Long.valueOf(id));
	}

	@Override
	public boolean exists(String id) {
		ContentExample ctExp = new ContentExample();
		ctExp.createCriteria().andIdEqualTo(Long.valueOf(id));
		Content content = mapper.selectByPrimaryKey(Long.valueOf(id));
		if (content == null)
			return false;
		else
			return true;
	}

	@Override
	public long count() {
		return mapper.countByExample(new ContentExample());
	}

	@Override
	public long countByCondition(ContentExample e) {
		return mapper.countByExample(e);
	}

}
