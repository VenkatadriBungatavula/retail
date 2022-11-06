package com.talentinvest.retail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talentinvest.retail.model.Employee;
import com.talentinvest.retail.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	public List<Employee> getAllEmployee(){
		return employeeRepo.findAll();
	}
	public void deleteEmployee(int eID) {
		employeeRepo.deleteById(eID);
		
				
	}
}
