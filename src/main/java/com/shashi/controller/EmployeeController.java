package com.shashi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shashi.model.Employee;

import com.shashi.serviceI.EmployeeServiceI;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServiceI employeeServiceI;
	
	@PostMapping(value="/addEmployeeData",consumes = "Application/json")
	public ResponseEntity<String> addEmployeeData(@RequestBody Employee employee){
		
		Employee addemployee = employeeServiceI.addemployee(employee);
		
		String msg=addemployee.getEmpId() + " Add Employee Data sucessfully";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);	
	}
	
	@GetMapping(value ="/getid/{id}",produces="Application/json")	
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id){
		
		Employee get = employeeServiceI.getEmployeeById(id);
		return  new ResponseEntity<Employee>(get,HttpStatus.OK);
		
	}
	@GetMapping(value ="/getdata",produces="Application/json")	
	public ResponseEntity<List<Employee>> getAllEmployeedata(@RequestBody Employee empolyee){
		List<Employee> allEmployeedata = employeeServiceI.getAllEmployeedata(empolyee);
		return new ResponseEntity(allEmployeedata,HttpStatus.OK)  ;
		
	}
	@PostMapping(value="/updatedata")
	public ResponseEntity<String> UpdateData(@RequestBody Employee employee){
		Employee update = employeeServiceI.update(employee);
		String msg=update + "Employee data updated";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	@PostMapping(value="/login",consumes = "Application/json")
	public ResponseEntity<String> LoginCheck(@RequestBody Employee employee){
		Employee loginCheck = employeeServiceI.loginCheck(employee);
		if(loginCheck==null) {
			String msg=loginCheck + "Login failed";
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		}
		String msg=loginCheck + "Login sucessfully done";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	@GetMapping(value="/deletId/{id}",consumes = "Application/json")
	public ResponseEntity<String> deleteById(@PathVariable Integer id){
		Employee deletebyId = employeeServiceI.deletebyId(id);
		String msg=deletebyId+ "Id deleted sucessfully";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	@PostMapping(value="/multipledataAdd",consumes = "Application/json")
	public ResponseEntity<List<Employee>> MultipledataAdd(@RequestBody List<Employee>employee){
		
		List<Employee> multipleEmployeeadd = employeeServiceI.multipleEmployeeadd(employee);
		return new ResponseEntity<List<Employee>>(multipleEmployeeadd,HttpStatus.CREATED);
		
	}
	@PostMapping(value="/MultipledataUpdate",consumes = "Application/json")
	public ResponseEntity<List<Employee>> MultipledataUpdate(@RequestBody List<Employee>employee){
		List<Employee> multipleDataUpdate = employeeServiceI.multipleDataUpdate(employee);
		return new ResponseEntity<List<Employee>>(multipleDataUpdate,HttpStatus.OK);
		
	}
	
	@GetMapping(value="/deleteAll",consumes = "Application/json")
	public ResponseEntity<String> deleteAll(Employee employee){
		employeeServiceI.deleteAll(employee);
		String msg="Delete all data Sucessfully";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	
	}
	


