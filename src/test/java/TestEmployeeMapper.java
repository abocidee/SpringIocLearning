import java.util.List;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.spring.entity.Customer;
import cn.tedu.spring.entity.Employee;
import cn.tedu.spring.entity.User;
import cn.tedu.spring.mapper.CustomerMapper;
import cn.tedu.spring.mapper.EmployeeMapper;
import cn.tedu.spring.mapper.UserMapper;

public class TestEmployeeMapper {
	
	@Test
	public void testEmployeeList() {
		AbstractApplicationContext ac
			= new ClassPathXmlApplicationContext("spring-mvc.xml",
				"spring-dao.xml","bean2.xml");
		
		EmployeeMapper EmployeeMapper
			= ac.getBean(EmployeeMapper.class);
		
		List<Employee> users = EmployeeMapper.getEmployeeList();
		for (Employee user : users) {
			System.out.println(user);
		}
		
		ac.close();
	}
	
  
	
}
