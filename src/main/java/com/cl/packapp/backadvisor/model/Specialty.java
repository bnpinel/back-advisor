package com.cl.packapp.backadvisor.model;

import org.springframework.data.annotation.Id;

public class Specialty {
	
	@Id
	private String id;
	private String name;

	public Specialty() {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
