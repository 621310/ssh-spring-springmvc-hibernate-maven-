package cn.lyl.ssh.model;

public class Comment {
	private Integer cid;
	private String  con;//��������
	private Integer praiser;//������
	public Integer getPraiser() {
		return praiser;
	}
	public void setPraiser(Integer praiser) {
		this.praiser = praiser;
	}
	private User user;//�����û�
	private Topic topic; //���ۻ���
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
