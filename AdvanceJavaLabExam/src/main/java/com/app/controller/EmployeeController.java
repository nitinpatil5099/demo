package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Comapnay;
import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	
	@RequestMapping("/add")
	public String home()
	{
		System.out.println("in employee add method ");
		return "/employee/addPlayerForm";
	}
	
	@PostMapping("/show")
	public String addEmployee(@RequestParam String fn,@RequestParam String ln,@RequestParam String city,@RequestParam String myCompany,Model map)
	{
		Employee employee=new Employee(fn,ln,city,Comapnay.valueOf(myCompany));
		String result=empService.addEmployee(employee);
		map.addAttribute("employee",result);
		System.out.println("in employee show method ");
		return "/employee/show";
	}
	
	@RequestMapping("/display")
	public String displayEmployee(Model map)
	{
		List<Employee>list=empService.emplsList();
		map.addAttribute("emplist",list);
		System.out.println("in employee show method");
		return "/employee/display";
	}
	@RequestMapping("/displayByCompany")
	public String displayByCompany(@RequestParam String myCompany, Model map)
	{
//		String myCompany="TCS";
		List<Employee>empListByCompany=empService.emplsListByCompany(Comapnay.valueOf(myCompany));
		empListByCompany.forEach(p->System.out.println(p));
		map.addAttribute("empListByComp",empListByCompany);
		return "/employee/displayByCompany";
		
	}
	
	@RequestMapping("/find")
	public String displayByCompany()
	{
//		
		return "/employee/find";
		
	}
	
}
