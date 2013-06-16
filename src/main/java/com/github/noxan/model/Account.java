package com.github.noxan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "accounts", catalog = "learningspring", uniqueConstraints = {
	@UniqueConstraint(columnNames = "username"),
	@UniqueConstraint(columnNames = "email")
})

public class Account implements Serializable {
	private static final long serialVersionUID = -1770711740999135212L;
	
	private Integer accountId;
	private String username;
	private String email;
	private String password;

	
	public Account() {
	}
	
	public Account(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getAccountId() {
		return this.accountId;
	}
	
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	@Column(name = "username", unique = true, nullable = false, length = 100)
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "email", unique = true, nullable = false, length = 255)
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "password", nullable = false, length = 255)
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Account[username="+username+", email="+email+", password="+password+"]";
	}
}
