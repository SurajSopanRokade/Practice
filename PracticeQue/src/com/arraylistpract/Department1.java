package com.arraylistpract;

public class Department1 {
	int id;
	String name;
	String location;
	public Department1() {
		// TODO Auto-generated constructor stub
	}
	
	public Department1(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Department1 [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
