package cn.lyl.ssh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lyl.ssh.dao.TopicDao;
import cn.lyl.ssh.model.Topic;

@Service
public class TopicServiceImpl extends BaseServiceImpl<Topic> implements TopicService {

	@Autowired
private TopicDao topicDao;
	
	@Override
	public List<Topic> getAllTopic() {
		return topicDao.getAllTopic();
	}

}
