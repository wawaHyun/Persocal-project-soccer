package com.study.api.user;

import java.sql.SQLException;
import java.util.*;


public interface UserService {

    List<User> findAll()throws SQLException;
}
