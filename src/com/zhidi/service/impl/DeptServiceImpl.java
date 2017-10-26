package com.zhidi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhidi.dao.impl.IDeptDao;
import com.zhidi.entity.Dept;
import com.zhidi.service.IDeptService;

@Service
public class DeptServiceImpl implements IDeptService{
	
	//service调用dao

	@Autowired
	private IDeptDao deptDao;
	
	@Override
	public Dept get(Integer id) {
		return deptDao.get(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Dept dept) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Dept> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}
