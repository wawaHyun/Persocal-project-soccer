
package com.study.api.account;


import java.sql.SQLException;
import java.util.*;

import org.springframework.stereotype.Service;

import com.study.api.common.AbstractService;
import com.study.api.enums.Messenger;

@Service
public class AccountServiceImpl extends AbstractService<Account> implements AccountService {

    @Override
    public String deposit(Account accountInfor) {
     return null;
    }

    @Override
    public String withdraw(Account accountInfor) {
        return null;
    }

    @Override
    public String getBalance(Account accountInfor) {
        return null;
    }

    @Override
    public Messenger save(Account t) throws SQLException {
        return null;
    }

    @Override
    public List<Account> findAll() throws SQLException {
        return null;
    }

    @Override
    public Optional<Account> findById(Long id) throws SQLException {
        return null;
    }

    @Override
    public String count() {
        return null;
    }

    @Override
    public Optional<Account> getOne(String memberid) {
        return null;
    }

    @Override
    public Messenger delete(Account t) throws SQLException {
        return null;
    }

    @Override
    public Boolean existsById(Long id) {
        return null;
    }

}