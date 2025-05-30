package com.example.demo.Service;

import com.example.demo.model.Employee;
import java.util.List;


public interface ServiceInterface {
 
	//created an method 
	public String saveEmployee(Employee employee);
	
	List<Employee> fetchAllEmployees();
	
	public String updateEmpData(Employee employee);
	
	public String deleteEmpData(int eid);
	
	

}
