package com.kodnest.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class employee {
	ArrayList<String> technologies;
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(ArrayList<String> technologies, HashSet<String> projects, HashMap<Integer, String> organization) {
		super();
		this.technologies = technologies;
		this.projects = projects;
		this.organization = organization;
	}
	@Override
	public String toString() {
		return "employee [technologies=" + technologies + ", projects=" + projects + ", organization=" + organization
				+ "]";
	}
	public ArrayList<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(ArrayList<String> technologies) {
		this.technologies = technologies;
	}
	public HashSet<String> getProjects() {
		return projects;
	}
	public void setProjects(HashSet<String> projects) {
		this.projects = projects;
	}
	public HashMap<Integer, String> getOrganization() {
		return organization;
	}
	public void setOrganization(HashMap<Integer, String> organization) {
		this.organization = organization;
	}
	HashSet<String> projects;
	HashMap<Integer, String> organization;	
}