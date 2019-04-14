package cn.lyl.ssh.dao;

public interface BaseDao<T> {
	public void add(T t);
	public void delete(Integer id);
	public T getOne(Integer id);
}
