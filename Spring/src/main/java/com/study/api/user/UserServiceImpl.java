package com.study.api.user;

import java.sql.SQLException;
import java.util.*;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    @Override
    public List<User> findAll()throws SQLException {
       return repo.findAll();

}

}
