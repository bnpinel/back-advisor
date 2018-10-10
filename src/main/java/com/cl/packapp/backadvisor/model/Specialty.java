package com.cl.packapp.backadvisor.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Specialty {
	
	@Field("id")
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


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
}
