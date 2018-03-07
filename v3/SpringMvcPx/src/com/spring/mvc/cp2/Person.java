package com.spring.mvc.cp2;

import java.io.Serializable;

//JavaBean
public class Person implements Serializable{

	private static final long serialVersionUID = 8616706620368438649L;
	
	private String username;
	
	private String password;
	
	private Integer age;
	
	private Integer weight;
	
	private String address;
	
	
	//一定要加setter&getter，如果不加，前后台传值和取值的时候，不生效
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
