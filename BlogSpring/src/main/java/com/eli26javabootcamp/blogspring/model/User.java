package com.eli26javabootcamp.blogspring.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String userNama;
	@Column
	private String password;
	@Column
	private String email;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getUserNama() {
	return userNama;
}
public void setUserNama(String userNama) {
	this.userNama = userNama;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
