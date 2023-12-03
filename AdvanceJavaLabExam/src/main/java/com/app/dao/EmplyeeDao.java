package com.app.dao;

import java.util.List;

import com.app.pojos.Comapnay;
import com.app.pojos.Employee;


public interface EmplyeeDao {

	public String addEmployee(Employee employee);
	public List<Employee>emplsList();
	public List<Employee>emplsListByCompany(Comapnay compnay);
}
