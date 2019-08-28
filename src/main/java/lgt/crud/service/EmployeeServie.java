package lgt.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lgt.crud.bean.Employee;
import lgt.crud.bean.EmployeeExample;
import lgt.crud.bean.EmployeeExample.Criteria;
import lgt.crud.dao.EmployeeMapper;

@Service
public class EmployeeServie {
	
	@Autowired
	EmployeeMapper employeeMapper;

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeeMapper.selectByExampleWithDept(null);
	}

	public void saveEmp(Employee employee) {
		// TODO Auto-generated method stub
		employeeMapper.insertSelective(employee);
		
	}

	/**
	 * 检验用户名是否可用
	 * @param empName
	 * @return
	 */
	public boolean checkUser(String empName) {
		// TODO Auto-generated method stub
		EmployeeExample example = new EmployeeExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmpNameEqualTo(empName);
		long count = employeeMapper.countByExample(example);
		return count == 0;
	}

}
