package cn.lyl.ssh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lyl.ssh.dao.CommentDao;
import cn.lyl.ssh.model.Comment;

@Service
public class CommentServiceImpl extends BaseServiceImpl<Comment> implements CommentService {

	@Autowired
	private CommentDao commentDao;
	@Override
	public List<Comment> getAllComment() {
		return commentDao.getAllComment();
	}

}
