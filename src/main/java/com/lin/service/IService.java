package com.lin.service;

public interface IService<T> {
    int save(T entity);
    int delete(Object key);
    int updateAll(T entity);
    int updateNotNull(T entity);
    T selectByKey(Object key);
}
