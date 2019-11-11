package cn.tedu.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cn.tedu.spring.entity.Employee;

@Mapper
public interface EmployeeMapper {
   
	@Select("select employeeNumber,lastName,firstName,extension,email,officeCode,reportsTo,jobTitle from employees")
	List<Employee>  getEmployeeList();
}
