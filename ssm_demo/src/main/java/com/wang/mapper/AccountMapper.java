package com.wang.mapper;

import com.wang.domain.Account;

import java.util.List;

public interface AccountMapper {
    public void save(Account account);
    public List<Account> findAll();
}
