package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.model.Employee;

//import com.example.demo.model.Employee;

@Service
public class ServicePageImplemantation implements ServiceInterface {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
    //@Override
    //public String saveEmployee(Employee employee) {
       //return "The request is from service method and the Employee data  saved: " + employee.getEname() + ", Salary: " + employee.getSalary();
    
	
	 @Override
	 public String saveEmployee(Employee employee) {
	    employeeRepository.save(employee);
	     return "Employee details saved successfully";
	    }
		
	@Override
	public List<Employee> fetchAllEmployees() {
		return employeeRepository.findAll();
	}
	@Override
	public String updateEmpData(Employee employee) {
		employeeRepository.save(employee);
		return "Employee updated successfully";
	}

	@Override
	public String deleteEmpData(int eid) {
		employeeRepository.deleteById(eid);
		return "Employee data deleted successfully";
	}
	}
