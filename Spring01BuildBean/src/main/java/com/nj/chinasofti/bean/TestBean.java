package com.nj.chinasofti.bean;

public class TestBean {
	private int id;
	private String name;
	private String pass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "TestBean [id=" + id + ", name=" + name + ", pass=" + pass + "]";
	}
	
}
