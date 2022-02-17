package com.wang.service;

import com.wang.domain.Account;

import java.util.List;

public interface AccountService {

    public void save(Account account);
    public List<Account> findAll();


}
