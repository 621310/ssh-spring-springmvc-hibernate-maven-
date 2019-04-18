package cn.lyl.ssh.dao;


import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import cn.lyl.ssh.model.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public void updateUser(User user) {
		getSession().update(user);
	}

	@Override
	public User getUsername(String username) {
		String hql = "from User where username=?0";
		Session session = getSession();
		Query<User> query = session.createQuery(hql);
		query.setParameter(0, username);
		return  query.uniqueResult();
	}

}
