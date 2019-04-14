package cn.lyl.ssh.dao;

import java.util.List;

import cn.lyl.ssh.model.Comment;

public interface CommentDao extends BaseDao<Comment> {
	public List<Comment> getAllComment();
}
