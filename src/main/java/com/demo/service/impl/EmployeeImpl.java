package com.demo.service.impl;

import org.apache.ibatis.session.SqlSession;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.demo.dao.EmployeeMapper;
import com.demo.entity.Employee;
import com.demo.service.IEmployeeService;
import com.demo.utils.MybatisUtils;

public class EmployeeImpl implements IEmployeeService {

	@Override
	public Employee getEmployee(Integer employeeId) {
		SqlSession sqlSession = MybatisUtils.getSqlSession(true);
		return sqlSession.getMapper(EmployeeMapper.class).getEmployee(employeeId);
	}

	@Override
	public PageInfo<Employee> getEmployees(Integer pageIndex, Integer pageSize) {
		PageHelper.startPage(pageIndex, pageSize);
		try  {
            SqlSession sqlSession = MybatisUtils.getSqlSession(true);
			return new PageInfo<Employee>(sqlSession.getMapper(EmployeeMapper.class).getEmployees());
		} catch (RuntimeException e) {
			throw e;
		}
	}

    @Override
    public Employee save(Employee employee) {
        SqlSession sqlSession = MybatisUtils.getSqlSession(true);
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        mapper.insert(employee);
        return employee;
    }

}
