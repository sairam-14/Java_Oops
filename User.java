package com.real;

public class User 
{
	private String name;
	private int age;
	private long mb_no;
	private long alt_mb_no;
	private String mail_id;
	private String alt_mail_id;
	private String pwd;
	public User(String name,int age,long mb_no,long alt_mb_no,String mail_id,String alt_mail_id,String pwd) 
	{
		this.name=name;
		this.age=age;
		this.mb_no=mb_no;
		this.alt_mb_no=alt_mb_no;
		this.mail_id=mail_id;
		this.alt_mail_id=alt_mail_id;
		this.pwd=pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMb_no() {
		return mb_no;
	}
	public void setMb_no(long mb_no) {
		this.mb_no = mb_no;
	}
	public long getAlt_mb_no() {
		return alt_mb_no;
	}
	public void setAlt_mb_no(long alt_mb_no) {
		this.alt_mb_no = alt_mb_no;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public String getAlt_mail_id() {
		return alt_mail_id;
	}
	public void setAlt_mail_id(String alt_mail_id) {
		this.alt_mail_id = alt_mail_id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
