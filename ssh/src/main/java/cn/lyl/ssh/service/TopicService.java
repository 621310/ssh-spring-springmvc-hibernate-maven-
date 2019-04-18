package cn.lyl.ssh.service;

import java.util.List;

import cn.lyl.ssh.model.Topic;

public interface TopicService extends BaseService<Topic> {
	public List<Topic> getAllTopic();
}
