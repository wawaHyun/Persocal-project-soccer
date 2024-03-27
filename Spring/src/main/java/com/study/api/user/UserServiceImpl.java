package com.study.api.user;

import java.sql.SQLException;
import java.util.*;
import org.springframework.stereotype.Service;

import com.study.api.common.AbstractService;
import com.study.api.enums.Messenger;

@Service
public class UserServiceImpl extends AbstractService<Member> implements UserService {

    @Override
    public Map<String, ?> login(Member memberParam) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    @Override
    public Map<String, ?> updatePassword(Member user) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePassword'");
    }

    @Override
    public Map<String, ?> findUsersByName(Member name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUsersByName'");
    }

    @Override
    public Map<String, ?> findUsersByNemeFramMap(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUsersByNemeFramMap'");
    }

    @Override
    public Map<String, ?> findUsersByJob(String userJob) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUsersByJob'");
    }

    @Override
    public Map<String, ?> findUsersByJobFromMap(String job) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUsersByJobFromMap'");
    }

    @Override
    public String addUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addUsers'");
    }

    @Override
    public Map<String, ?> getUserMap() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserMap'");
    }

    @Override
    public String test() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'test'");
    }

    @Override
    public Map<String, ?> findUsers() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUsers'");
    }

    @Override
    public Messenger touch() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'touch'");
    }

    @Override
    public Messenger rm() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rm'");
    }

    @Override
    public Map<String, ?> tain(Member mems) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tain'");
    }

    @Override
    public Map<String, ?> ls() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ls'");
    }

    @Override
    public Messenger save(Member t) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public List<Member> findAll() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<Member> findById(Long id) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public String count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public Optional<Member> getOne(String memberid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOne'");
    }

    @Override
    public Messenger delete(Member t) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Boolean existsById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }
    
}
