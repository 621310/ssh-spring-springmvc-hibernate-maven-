package cn.lyl.ssh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import cn.lyl.ssh.model.Comment;

@Repository("commentDao")
public class CommentDaoImpl extends BaseDaoImpl<Comment> implements CommentDao {

	@Override
	public List<Comment> getAllComment() {
		String hql = "from Comment";
		Session session = getSession();
		Query<Comment> query = session.createQuery(hql);
		return query.list();
	}

}
