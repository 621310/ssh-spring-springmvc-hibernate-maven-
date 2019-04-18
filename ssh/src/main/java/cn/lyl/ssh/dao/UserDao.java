package cn.lyl.ssh.dao;


import cn.lyl.ssh.model.User;

public interface UserDao extends BaseDao<User> {
	public void updateUser(User user);
	
	//根据用户名查询用户
		public User getUsername(String username);
}
