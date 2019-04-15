package cn.lyl.ssh.service;

import org.springframework.beans.factory.annotation.Autowired;

import cn.lyl.ssh.dao.BaseDao;

public class BaseServiceImpl<T> implements BaseService<T> {
	
	@Autowired
	public BaseDao baseDao;
	
	@Override
	public void add(T t) {
		baseDao.add(t);
	}

	@Override
	public void delete(Integer id) {
		baseDao.delete(id);
	}

	@Override
	public T getOne(Integer id) {
		return (T) baseDao.getOne(id);
	}

}
