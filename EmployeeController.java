package com.saveoperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saveoperation.model.Employee;
import com.saveoperation.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")    //  http://localhost:8080/employee/save
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		
		Employee emp = employeeService.saveEmployee(employee);
		return ResponseEntity.ok(emp);
		
	}
	
	@GetMapping("/get/{id}")    //  http://localhost:8080/employee/get/5
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer id){
		Employee employee = employeeService.getEmployeeById(id);
		return ResponseEntity.ok().body(employee);
	}

}
