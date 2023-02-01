package com.solvd.services;

import java.sql.SQLException;
import java.util.List;

public interface IBaseService <T>{
    T get(Long id) throws SQLException;

    List<T> getAll() throws SQLException;
    void save(T t) throws SQLException;

    void insert(T t) throws SQLException;

    void update(T t) throws SQLException;

    void  delete(T t) throws SQLException;
}
