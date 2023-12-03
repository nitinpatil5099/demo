package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Comapnay;
import com.app.pojos.Employee;
@Repository
public class EmployeeDaoImpl implements EmplyeeDao {

	@Autowired
	private EntityManager manager;
	@Override
	public String addEmployee(Employee employee) {
		manager.persist(employee);
		return "employee added successfully";
	}
	@Override
	public List<Employee> emplsList() {
		String jpql="select e from Employee e";
		
		return manager.createQuery(jpql,Employee.class).getResultList();
	}
	@Override
	public List<Employee> emplsListByCompany(Comapnay company) {
		String jpql="select e from Employee e where e.companyName =:company";
		return manager.createQuery(jpql,Employee.class).setParameter("company", company).getResultList();
	}
	
	

}
