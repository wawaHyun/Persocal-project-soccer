package com.turing.api.common;

import java.sql.SQLException;
import java.util.*;
import com.turing.api.enums.Messenger;

public abstract class AbstractService<T> {
    public abstract Messenger save(T t) throws SQLException; // craete something

    public abstract List<T> findAll() throws SQLException; // list

    public abstract Optional<T> findById(Long id) throws SQLException;

    public abstract String count(); // 수 세는거

    public abstract Optional<T> getOne(String memberid);

    public abstract Messenger delete(T t) throws SQLException;

    public abstract Boolean existsById(Long id);
}
