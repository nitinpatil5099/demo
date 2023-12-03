package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empNumber;
	private String firstName;
	private String lastName;
	private String city;
	@Enumerated(EnumType.STRING)
	private Comapnay companyName;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("in emplyee ctor "+getClass());
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Comapnay getCompanyName() {
		return companyName;
	}


	public void setCompanyName(Comapnay companyName) {
		this.companyName = companyName;
	}


	public Employee( String firstName, String lastName, String city, Comapnay companyName) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.companyName = companyName;
	}


	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", city="
				+ city + ", companyName=" + companyName + "]";
	}
	
}
