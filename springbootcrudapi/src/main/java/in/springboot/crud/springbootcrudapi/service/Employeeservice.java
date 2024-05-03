package in.springboot.crud.springbootcrudapi.service;

import java.util.List;

import in.springboot.crud.springbootcrudapi.model.Employee;

public interface Employeeservice {
		List<Employee> get();
	 
	 Employee get(int id);
	 
	 void save(Employee employee);
	 
	 void delete(int id);

}
