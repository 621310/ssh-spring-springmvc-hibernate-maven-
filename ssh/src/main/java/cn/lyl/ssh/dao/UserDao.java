package cn.lyl.ssh.dao;


import cn.lyl.ssh.model.User;

public interface UserDao extends BaseDao<User> {
	public void updateUser(User user);
	
	//�����û�����ѯ�û�
		public User getUsername(String username);
}
