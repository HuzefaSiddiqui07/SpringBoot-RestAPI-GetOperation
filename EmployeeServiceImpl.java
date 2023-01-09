package com.saveoperation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saveoperation.dao.EmployeeRepository;
import com.saveoperation.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		Employee employee = employeeRepository.findById(id).get(); // null
		return employee;
	}
	
}
