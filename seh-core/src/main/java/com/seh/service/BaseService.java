package com.seh.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xinhezhang on 2018/3/31.
 */
public interface BaseService<T,P>
{
    void save(T entity);

    void delete(P id);

    void update(T entity);

    T findById (P id);

    List<T> getAll();
}
