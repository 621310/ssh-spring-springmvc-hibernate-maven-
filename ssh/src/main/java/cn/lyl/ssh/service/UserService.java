package cn.lyl.ssh.service;



import cn.lyl.ssh.model.User;


public interface UserService extends BaseService<User> {
	public void updateUser(User user);
	
	//�����û�����ѯ�û�
	public User getUsername(String username);
}
