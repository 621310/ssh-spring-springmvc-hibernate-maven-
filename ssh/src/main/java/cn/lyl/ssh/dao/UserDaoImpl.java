package cn.lyl.ssh.dao;

import org.springframework.stereotype.Repository;

import cn.lyl.ssh.model.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public void updateUser(User user) {
		getSession().update(user);
	}

}
