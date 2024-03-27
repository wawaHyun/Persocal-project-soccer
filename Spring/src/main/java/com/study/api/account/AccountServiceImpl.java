
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }

    @Override
    public String withdraw(Account accountInfor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }

    @Override
    public String getBalance(Account accountInfor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBalance'");
    }

    @Override
    public Messenger save(Account t) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public List<Account> findAll() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<Account> findById(Long id) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public String count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public Optional<Account> getOne(String memberid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOne'");
    }

    @Override
    public Messenger delete(Account t) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Boolean existsById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

}