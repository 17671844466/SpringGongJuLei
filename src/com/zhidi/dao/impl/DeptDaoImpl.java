package com.zhidi.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhidi.entity.Dept;

@Repository
public class DeptDaoImpl extends BaseDaoImpl<Dept, Integer> implements IDeptDao{

	@Override
	public List<Dept> getListByPage(Integer pageNumber, Integer pageSize) {
		
		
		return null;
	}

}
