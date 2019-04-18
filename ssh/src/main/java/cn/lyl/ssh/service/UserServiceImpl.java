package cn.lyl.ssh.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lyl.ssh.dao.UserDao;
import cn.lyl.ssh.model.User;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public User getUsername(String username) {
		return userDao.getUsername(username);
	}

}
