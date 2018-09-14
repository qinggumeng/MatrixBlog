package com.matrix.dao;

import com.matrix.pojo.Content;
import com.matrix.pojo.ContentExample;
import java.util.List;

public interface ContentMapper {
    long countByExample(ContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Content record);

    int insertSelective(Content record);

    List<Content> selectByExample(ContentExample example);

    Content selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKey(Content record);
}