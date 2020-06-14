package com.proyecto.api;

import javax.persistence.*;

@Entity
@Table(name="user")
public class user {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column
	private String created_at;
	
	@Column
	private String update_at;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(String update_at) {
		this.update_at = update_at;
	}
	
	
	
}
