package com.demo.test;

import org.junit.Before;
import org.junit.Test;

import com.github.pagehelper.PageInfo;
import com.demo.entity.Employee;
import com.demo.service.IEmployeeService;
import com.demo.service.impl.EmployeeImpl;
public class Test4 {
	private IEmployeeService employeeService;

	@Before
	public void init() {
		employeeService = new EmployeeImpl();
	}

	@Test
	public void testGet() {
		Employee employee = employeeService.getEmployee(2);
		System.out.println(employee.toString());
	}
	@Test
	public void testGets() {
		PageInfo<Employee> employees = employeeService.getEmployees(1,2);
		System.out.println(employees.getTotal());
	}
    @Test
    public void testSave() {
        Employee employee = new Employee();
        employee.setDepartmentId(2);
        employee.setEmployeeLoginName("lan");
        employee.setEmployeeLoginPassword("123");
        employee.setEmployeeNickName("lannickname");
        employee.setJobId(2);
        employee.setRoleId(3);
        employeeService.save(employee);
        System.out.println(employee.getEmployeeId());
    }

}
