package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ServiceInterface;
import com.example.demo.model.Employee;
import java.util.List;


//converting  java class into a controller.
@RestController
public class EmployeeController {
 
	
	@Autowired
	private ServiceInterface serviceEmp;
	
	
	
	@GetMapping("/Welcome")
	public String Welcome() {
		return "Hello SK welcome to spring boot course";
	}
			//to get from model and return the name 
	@PostMapping("/saveEmployeeData")
	public String saveEmployeeData(@RequestBody Employee employee) {
	return "Response from the controller: " + employee.getEname();
		}
	
	//to get request from service page
	

	@PostMapping("/serviceEmployeeData")
	public String EmployeeData(@RequestBody Employee employee) {
	   return serviceEmp.saveEmployee(employee);
	    
	}
	    	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return serviceEmp.fetchAllEmployees();
	}
	
	@PutMapping("/employee")
	public String UpdateEmployee(@RequestBody Employee employee) {
		return serviceEmp.updateEmpData(employee);
	}
	
	@DeleteMapping("/employee")
	public String DeleteEmployee(@PathVariable Integer eid) {
		return serviceEmp.deleteEmpData(eid);
	}
	
	}
