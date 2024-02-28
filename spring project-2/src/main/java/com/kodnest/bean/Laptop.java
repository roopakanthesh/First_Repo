package com.kodnest.bean;

public class Laptop {
	public Laptop() {
		super();
		System.out.println("0-parameter constructor");
		// TODO Auto-generated constructor stub
	}

	public Laptop(String name, String color) {
		super();
		this.name = name;
		this.color = color;
		System.out.println("parameterized constructor");
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", color=" + color + "]";
	}

	String name;
	String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setter-name");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		System.out.println("setter-color");
	}

}
