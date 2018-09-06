package com.matrix.dao;

import com.matrix.pojo.Content;
import com.matrix.pojo.ContentExample;
import java.util.List;

import org.springframework.stereotype.Repository;
/**
 * 文章实体映射接口
 * @author JasonFu
 * @createTime 2018年9月6日 下午1:59:40
 */
@Repository
public interface ContentMapper {
    int deleteByPrimaryKey(Long id);
    int insert(Content record);
    int insertSelective(Content record);
    List<Content> selectByExample(ContentExample example);
    Content selectByPrimaryKey(Long id);
    int updateByPrimaryKeySelective(Content record);
    int updateByPrimaryKey(Content record);
}