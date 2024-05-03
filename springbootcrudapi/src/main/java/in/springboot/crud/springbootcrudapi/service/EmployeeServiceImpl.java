package in.springboot.crud.springbootcrudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.springboot.crud.springbootcrudapi.dao.EmployeeDAO;
import in.springboot.crud.springbootcrudapi.model.Employee;


@Service
public class EmployeeServiceImpl implements Employeeservice {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Transactional
	@Override
	public List<Employee> get() {
		return  employeeDAO.get();
	}

	@Transactional
	@Override
	public Employee get(int id) {
		return employeeDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void delete(int id) {
		employeeDAO.delete(id);
	}

}
