package com.cl.models;

import java.util.Set;

public class Advisor {
	
	private String id;
	private String firstName;
    private String lastName;
    private Set<Specialty> specialties;
    
    
    
    public Advisor(String id, String firstName, String lastName, Set<Specialty> specialties) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.setSpecialties(specialties);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Set<Specialty> getSpecialties() {
		return specialties;
	}

	public void setSpecialties(Set<Specialty> specialties) {
		this.specialties = specialties;
	}

}
