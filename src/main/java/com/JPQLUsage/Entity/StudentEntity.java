package com.JPQLUsage.Entity;

import jakarta.persistence.Entity;

@Entity
public class StudentEntity {
	@jakarta.persistence.Id
	private int Id;
	private String name;
	private String branch;
	private String area;
	@Override
	public String toString() {
		return "StudentEntity [Id=" + Id + ", name=" + name + ", branch=" + branch + ", area=" + area + "]";
	}
	
	public StudentEntity(int id, String name, String branch, String area) {
		super();
		Id = id;
		this.name = name;
		this.branch = branch;
		this.area = area;
	}

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

}
