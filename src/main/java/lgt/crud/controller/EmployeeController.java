package lgt.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lgt.crud.bean.Employee;
import lgt.crud.bean.Msg;
import lgt.crud.service.EmployeeServie;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeServie employeeServie;
	
	@RequestMapping("/checkuser")
	@ResponseBody
	public Msg checkuser(String empName) {
		boolean b = employeeServie.checkUser(empName);
		if(b) {
			return Msg.success();
		}else {
			return Msg.fail();
		}
		
	}
	
	
	@RequestMapping(value="/emp",method = RequestMethod.POST)
	@ResponseBody
	public Msg saveEmp(Employee employee) {
		employeeServie.saveEmp(employee);
		return Msg.success();
	}
	
	@RequestMapping("/emps")
	@ResponseBody
	public Msg getEmpWithDeptList(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		PageHelper.startPage(pn,5);
		List<Employee> emps = employeeServie.getAll();
		PageInfo page = new PageInfo(emps,5); 
		return Msg.success().add("PageInfo",page);
	}
	
//	@RequestMapping("/emps")
	public String getEmps(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model) {
//		传入页码，以及每页大小
		PageHelper.startPage(pn,5);
		List<Employee> emps = employeeServie.getAll();
		PageInfo page = new PageInfo(emps,5); 
		model.addAttribute("pageInfo",page);
		
		return "list";
	}

}
