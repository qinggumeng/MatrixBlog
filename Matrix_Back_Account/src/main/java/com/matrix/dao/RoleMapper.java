package com.matrix.dao;

import com.matrix.pojo.Role;
import com.matrix.pojo.RoleExample;
import java.util.List;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}