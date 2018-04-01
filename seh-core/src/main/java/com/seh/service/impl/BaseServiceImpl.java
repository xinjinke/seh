//package com.seh.service.impl;
//
//import com.seh.mapper.BaseMapper;
//import com.seh.service.BaseService;
//import org.apache.ibatis.binding.MapperProxy;
//import org.apache.ibatis.binding.MapperRegistry;
//
//import javax.annotation.Resource;
//import java.io.Serializable;
//import java.util.List;
//
///**
// * Created by xinhezhang on 2018/3/31.
// */
//public class BaseServiceImpl<T,P> implements BaseService<T,P>{
//
//    private BaseMapper<T,P> mapper;
//
//    @Resource
//    public void setMapper(BaseMapper<T,P> mapper){
//        this.mapper = mapper;
//    }
//
//    public void save(T entity) {
//        mapper.insertSelective(entity);
//    }
//
//    public void delete(P id) {
//        mapper.deleteByPrimaryKey(id);
//    }
//
//    public void update(T entity) {
//        mapper.updateByPrimaryKeySelective(entity);
//    }
//
//    public T findById(P id) {
//        return null;
//    }
//
//    public List<T> getAll() {
//        return mapper.selectAll();
//    }
//}
