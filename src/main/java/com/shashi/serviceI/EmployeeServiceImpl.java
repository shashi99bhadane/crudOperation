package com.shashi.serviceI;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shashi.model.Employee;
import com.shashi.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeServiceI{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee addemployee(Employee employee) {
		Employee save = employeeRepository.save(employee);
		return save;
	}

	@Override
	public List<Employee> multipleEmployeeadd(List<Employee> employee) {
		List<Employee> saveAll = employeeRepository.saveAll(employee);
		return saveAll;
	}

	@Override
	public List<Employee> multipleDataUpdate(List<Employee> employee) {
		List<Employee> updateAll = employeeRepository.saveAll(employee);
		return updateAll;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		Employee byId = employeeRepository.findById(id).get();
		return byId;
	}

	@Override
	public List<Employee> getAllEmployeedata(Employee employee) {
		List<Employee> findAll = employeeRepository.findAll();
		return findAll;
	}

	@Override
	public Employee update(Employee employee) {
		Employee update = employeeRepository.save(employee);
		return update;
	}

	@Override
	public Employee loginCheck(Employee employee) {
		Employee findByEmpidAndEmpage = employeeRepository.findByEmpIdAndEmpAge(employee.getEmpId(), employee.getEmpAge());
		return findByEmpidAndEmpage;
	}

	@Override
	public Employee deletebyId(int id) {
		employeeRepository.deleteById(id);
		return null;
		
	}

	@Override
	public void deleteAll(Employee employee) {
		employeeRepository.deleteAll();
		
	}
	
	
	


  }
