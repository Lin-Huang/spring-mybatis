package com.lin.service;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

public abstract class BaseService<T> implements IService<T> {
    @Autowired
    private Mapper<T> mapper;

    @Override
    public int save(T entity) {
        return this.mapper.insert(entity);
    }

    @Override
    public int delete(Object key) {
        return this.mapper.deleteByPrimaryKey(key);
    }

    @Override
    public int updateAll(T entity) {
        return this.mapper.updateByPrimaryKey(entity);
    }

    @Override
    public int updateNotNull(T entity) {
        return this.mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public T selectByKey(Object key) {
        return this.mapper.selectByPrimaryKey(key);
    }
}
