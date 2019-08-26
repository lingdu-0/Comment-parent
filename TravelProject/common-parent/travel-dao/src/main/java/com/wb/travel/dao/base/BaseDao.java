package com.wb.travel.dao.base;

public interface BaseDao<T> {
    T findById(Integer id);
    T findByUUId(String  uuid);
    int deleteById(Integer id);
    int deleteByUUId(String uuid);
    int insert (T t);
    int update(T t);
}
