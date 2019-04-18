package cn.lyl.ssh.service;

import java.util.List;

import cn.lyl.ssh.model.Comment;

public interface CommentService extends BaseService<Comment> {
	public List<Comment> getAllComment();
}
