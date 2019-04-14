package cn.lyl.ssh.dao;

import java.lang.reflect.ParameterizedType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDaoImpl<T> implements BaseDao<T> {

	public Class<T> getTClass(){
  	  	Class<T> tClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass())
            .getActualTypeArguments()[0];
   		return tClass;
	 }
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void add(T t) {
		getSession().save(t);
	}

	@Override
	public void delete(Integer id) {
		getSession().delete(getOne(id));
	}

	@Override
	public T getOne(Integer id) {
		return getSession().load(getTClass(),id);
	}

}
