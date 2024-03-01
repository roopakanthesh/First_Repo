package com.kodnest.bean;

public class Trainer {
	public Trainer() {
		super();
		System.out.println("constructor without parameter");
		// TODO Auto-generated constructor stub
	}

	public Trainer(int id, String name) {
		super();
		System.out.println("constructor with parameter");
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		System.out.println("getter-id");
		return id;
	}

	public void setId(int id) {
		System.out.println("setter-id");
		this.id = id;
	}

	public String getName() {
		System.out.println("getter-name");
		return name;
	}

	public void setName(String name) {
		System.out.println("setter-name");
		this.name = name;
	}

	int id;
	String name;

}
