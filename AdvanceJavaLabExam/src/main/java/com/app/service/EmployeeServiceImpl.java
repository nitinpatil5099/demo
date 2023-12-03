package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmplyeeDao;
import com.app.pojos.Comapnay;
import com.app.pojos.Employee;
@Service@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmplyeeDao empDao;
	
	@Override
	public String addEmployee(Employee employee) {
		
		return empDao.addEmployee(employee);
	}

	@Override
	public List<Employee> emplsList() {
		// TODO Auto-generated method stub
		return empDao.emplsList();
	}

	@Override
	public List<Employee> emplsListByCompany(Comapnay compnay) {
		// TODO Auto-generated method stub
		return empDao.emplsListByCompany(compnay);
	}

}
