package com.kodnest.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class University {
	public University() {
		super();
		System.out.println("constructor without parameter");
		// TODO Auto-generated constructor stub
	}

	public University(int uid, String uname, Trainer t) {
		super();
		System.out.println("constructor with parameter");
		this.uid = uid;
		this.uname = uname;
		this.t = t;
	}

	@Override
	public String toString() {
		return "University [uid=" + uid + ", uname=" + uname + ", t=" + t + "]";
	}

	public int getUid() {
		System.out.println("getter-uid");
		return uid;
	}

	public void setUid(int uid) {
		System.out.println("setter-uid");
		this.uid = uid;
	}

	public String getUname() {
		System.out.println("getter-uname");
		return uname;
	}

	public void setUname(String uname) {
		System.out.println("setter-uname");
		this.uname = uname;
	}

	public Trainer getT() {
		System.out.println("getter-trainer");
		return t;
	}

	public void setT(Trainer t) {
		System.out.println("setter-trainer");
		this.t = t;
	}

	int uid;
	String uname;
	@Autowired
	Trainer t;

}
