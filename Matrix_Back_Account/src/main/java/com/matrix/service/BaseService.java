package com.matrix.service;

import java.util.List;

import com.github.pagehelper.Page;
/**
 * 业务基本父接口
 * @author JasonFu
 * @createTime 2018年9月6日 下午2:01:15
 * @param <T>
 * @param <E>
 */
public interface BaseService<T, E> {
	T findOne(String id);
	List<T> search(E criteria);
	List<T> findAll();
	Page<T> findPageByConditon(E e, Integer currPage, Integer pageRows);
	T save(T entity);
	List<T> save(List<T> entities);
	T update(T entity);
	List<T> update(List<T> entities);
	void delete(String id);
	boolean exists(String id);
	long count();
	long countByCondition(E e);
}