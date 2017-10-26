package com.zhidi.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zhidi.dao.IBaseDao;

@Repository
public class BaseDaoImpl<T, PK extends Serializable> implements IBaseDao<T, PK> {
	
	//Class对象描述了java类的所有信息
	private Class entityClass;

	@Autowired
	private SessionFactory sessionFactory;

	// 指定一个无参构造器
	public BaseDaoImpl() {
		// 通过反射机制获取具体类
		Class clz = getClass();
		Type type = clz.getGenericSuperclass();
		// 在具体有子类继承时就能确定类型
		if (type instanceof ParameterizedType) {
			// 获取实际参数类型数组
			Type[] types = ((ParameterizedType) type).getActualTypeArguments();
			// 向下转型
			entityClass = (Class) types[0];
		}
	}

	protected Session getSession() {

		return sessionFactory.getCurrentSession();

	}

	public void save(T entity) {
		getSession().save(entity);
	}

	public void delete(PK id) {
		T t = get(id);
		getSession().delete(t);
	}

	public void update(T entity) {
		getSession().update(entity);
	}

	public T get(PK id) {

		return (T) getSession().get(entityClass, id);
	}

	public List<T> getAll() {
		
		return getSession().createQuery("from " + entityClass.getName()).list();
	}

}
