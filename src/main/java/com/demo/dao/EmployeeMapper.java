package com.demo.dao;

import java.util.List;

import com.demo.entity.Employee;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {

	Employee getEmployee(Integer employeeId);
	List<Employee> getEmployees();

    int insert(@Param("employee") Employee insertParams);
}
