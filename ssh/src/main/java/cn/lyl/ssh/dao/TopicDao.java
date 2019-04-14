package cn.lyl.ssh.dao;

import java.util.List;

import cn.lyl.ssh.model.Topic;

public interface TopicDao extends BaseDao<Topic> {
	public List<Topic> getAllTopic();
}
