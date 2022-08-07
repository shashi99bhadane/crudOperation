package com.shashi.serviceI;

import java.util.List;


import com.shashi.model.Employee;
public interface EmployeeServiceI {
	
	public Employee addemployee(Employee employee);
	public List<Employee> multipleEmployeeadd(List<Employee>employee);
	public List<Employee> multipleDataUpdate(List<Employee>employee);
	
	public Employee getEmployeeById(Integer id);
	
	public List<Employee> getAllEmployeedata(Employee employee);
	public Employee update(Employee employee);
	public  Employee loginCheck(Employee employee);
	public Employee deletebyId(int id);
	
	public void deleteAll(Employee employee);

}
