package com.talentinvest.retail.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.talentinvest.retail.model.Employee;
import com.talentinvest.retail.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
    static ArrayList<Employee> employeeList = new ArrayList<>();
  
 @RequestMapping("/employee")
 public ModelAndView EmployeePage() {
	 ModelAndView mav = new ModelAndView();
	 
//	 Employee e1 = new Employee(1,"Lakshman A", "29/03/1998", 10000);
//	 Employee e2 = new Employee(2,"Kishore C", "01/08/2000", 9000);
//	 Employee e3 = new Employee(3,"Ram B", "23/07/1998", 13000);
//	 Employee e4 = new Employee(4,"Lakshmi K", "29/05/1999", 7000);
//	 Employee e5 = new Employee(5,"Prasad K", "13/05/1997", 12000);
	 
//	 EmployeeList.add(e1);
//	 EmployeeList.add(e2);
//	 EmployeeList.add(e3);
//	 EmployeeList.add(e4);
//	 EmployeeList.add(e5);
	 
		List<Employee> employeeList = employeeService.getAllEmployee();
		mav.setViewName("employee");
		mav.addObject(employeeList);
		
		return mav;		
   }
    
   @RequestMapping("/createEmployee")
   public ModelAndView HomePage() {
	   ModelAndView mav = new ModelAndView();
	   mav.setViewName("createEmployee");
	   return mav;
   }
   
   @RequestMapping("/deleteEmployee/{eID}")
   public ModelAndView deleteEmployee(@PathVariable("eID") int eID) {
	   ModelAndView mav = new ModelAndView();
	   employeeService.deleteEmployee(eID);
	   List<Employee> EmployeeList = employeeService.getAllEmployee();
	   mav.setViewName("employee");
	   mav.addObject(EmployeeList);
	   return mav;
	   
	   
   }
}
