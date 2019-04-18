package cn.lyl.ssh.service;



import cn.lyl.ssh.model.User;


public interface UserService extends BaseService<User> {
	public void updateUser(User user);
	
	//根据用户名查询用户
	public User getUsername(String username);
}
