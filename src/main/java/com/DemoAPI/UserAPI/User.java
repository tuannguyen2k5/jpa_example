package com.DemoAPI.UserAPI;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id",nullable = false)
	private Integer id;

	@Column(name="name",nullable = false)
	private String name;

	@Column(name="status",nullable = false)
	private Integer status;

	public User() {

	}

	public User(Integer id, String name, int status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
