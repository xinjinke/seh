package com.seh.mapper;

import java.util.List;

/**
 * Created by xinhezhang on 2018/3/31.
 */
public interface BaseMapper<T,P> {

    List<T> selectAll();

    int insertSelective(T record);

    T selectByPrimaryKey(P id);

    int updateByPrimaryKeySelective(T record);

    int deleteByPrimaryKey(P id);
}
