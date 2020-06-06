package com.demo.dao;

import java.util.List;

import com.demo.entity.Employee;

public interface EmployeeMapper {

	Employee getEmployee(Integer employeeId);
	List<Employee> getEmployees();
}
