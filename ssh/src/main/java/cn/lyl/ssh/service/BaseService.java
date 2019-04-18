package cn.lyl.ssh.service;

public interface BaseService<T> {
	public void add(T t);
	public void delete(Integer id);
	public T getOne(Integer id);
}
