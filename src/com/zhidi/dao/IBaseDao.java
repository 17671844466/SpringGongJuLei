package com.zhidi.dao;

import java.util.List;

public interface IBaseDao<T, PK> {
	void save(T entity);

	void delete(PK id);

	void update(T entity);

	T get(PK id);

	List<T> getAll();
}
