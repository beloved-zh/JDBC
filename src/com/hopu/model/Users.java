package com.hopu.model;

/**
 * 用户
 */
public class Users {

	private String uid;//id
	private String uname;//姓名
	private String pwd;//密码
	private String userNo;//学号
	private String classroomID;//班级
	public Users() {
		super();
	}
	public Users(String uid, String uname, String pwd, String userNo, String classroomID) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.pwd = pwd;
		this.userNo = userNo;
		this.classroomID = classroomID;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getClassroomID() {
		return classroomID;
	}
	public void setClassroomID(String classroomID) {
		this.classroomID = classroomID;
	}
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", uname=" + uname + ", pwd=" + pwd + ", userNo=" + userNo + ", ClassroomID="
				+ classroomID + "]";
	}
	
	
}
