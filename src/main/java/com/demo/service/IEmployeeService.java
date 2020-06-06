package com.demo.service;

import com.github.pagehelper.PageInfo;
import com.demo.entity.Employee;

public interface IEmployeeService {
	Employee getEmployee(Integer employeeId);

	PageInfo<Employee> getEmployees(Integer pageIndex, Integer pageSize);
}
