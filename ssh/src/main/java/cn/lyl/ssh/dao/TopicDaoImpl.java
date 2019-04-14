package cn.lyl.ssh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import cn.lyl.ssh.model.Topic;

@Repository("topicDao")
public class TopicDaoImpl extends BaseDaoImpl<Topic> implements TopicDao {

	@Override
	public List<Topic> getAllTopic() {
		String hql = "from Topic";
		Session session = getSession();
		Query<Topic> query = session.createQuery(hql);
		return query.list();
	}

	
	
}
