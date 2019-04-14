package cn.lyl.ssh.model;

public class Topic {
	private Integer pid;
	private String content;//内容
	private Integer praise;//点赞数
	private User user;//发表用户
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getPraise() {
		return praise;
	}
	public void setPraise(Integer praise) {
		this.praise = praise;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Topic [pid=" + pid + ", content=" + content + ", praise=" + praise + ", user=" + user + "]";
	}
	
}
