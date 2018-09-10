package com.matrix.dao;

import com.matrix.pojo.Account;
import com.matrix.pojo.AccountExample;
import java.util.List;

public interface AccountMapper {
    long countByExample(AccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByExample(AccountExample example);

    Account selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}