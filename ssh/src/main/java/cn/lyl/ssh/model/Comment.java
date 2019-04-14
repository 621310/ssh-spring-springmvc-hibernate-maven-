package cn.lyl.ssh.model;

public class Comment {
	private Integer cid;
	private String  con;//评论内容
	private Integer praiser;//点赞数
	public Integer getPraiser() {
		return praiser;
	}
	public void setPraiser(Integer praiser) {
		this.praiser = praiser;
	}
	private User user;//发表用户
	private Topic topic; //评论话题
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	@Override
	public String toString() {
		return "Comment [cid=" + cid + ", con=" + con + ", praiser=" + praiser + ", user=" + user + ", topic=" + topic
				+ "]";
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
