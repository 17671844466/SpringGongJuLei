package com.zhidi.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhidi.dao.IBaseDao;
import com.zhidi.entity.Dept;

@Repository
public interface IDeptDao extends IBaseDao<Dept, Integer>{
	
	//每个实体的操作都是不一样的,特殊的在其Dao中实现
	
	List<Dept>  getListByPage(Integer pageNumber,Integer pageSize);
}
