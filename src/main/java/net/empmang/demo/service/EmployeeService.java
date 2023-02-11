package net.empmang.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.empmang.demo.exception.UserNotFoundException;
import net.empmang.demo.model.Employee;
import net.empmang.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	private final EmployeeRepo employeeRepo;

	@Autowired
	public EmployeeService(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	
	public Employee addEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeeRepo.save(employee);
	}
	
	public List<Employee> findAllEmployees(){
		return employeeRepo.findAll();
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public void deleteEmployee(Long id) {
		employeeRepo.deleteById(id);
	}
	
	public Employee findEmployeeById(Long id) {
		return employeeRepo.findEmployeeById(id)
				.orElseThrow(() -> new UserNotFoundException ("User by id: "+id+" was not found"));
	}

}
