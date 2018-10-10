package com.cl.packapp.backadvisor.model;

import java.util.List;

public class Advisor {
	
	private String id;
	private String firstName;
    private String lastName;
    private List<Specialty> specialties;
    
    public Advisor() {
    	
    }
    
    public Advisor(String id, String firstName, String lastName, List<Specialty> specialties) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialties = specialties;
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

	public List<Specialty> getSpecialties() {
		return specialties;
	}

	public void setSpecialties(List<Specialty> specialties) {
		this.specialties = specialties;
	}

}
