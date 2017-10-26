package com.zhidi.service;

import java.util.List;

import com.zhidi.entity.Dept;

public interface IDeptService {
		
	void save(Dept dept);

	void delete(Integer id);

	void update(Dept dept);

	List<Dept> getAll();

	Dept get(Integer dept);

	
	
	
	
}
