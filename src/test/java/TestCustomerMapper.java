import java.util.List;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.spring.entity.Customer;
import cn.tedu.spring.entity.User;
import cn.tedu.spring.joinentity.CustomerOrder;
import cn.tedu.spring.mapper.CustomerMapper;
import cn.tedu.spring.mapper.UserMapper;

public class TestCustomerMapper {
	
	@Test
	public void testGetCustomerList() {
		AbstractApplicationContext ac
			= new ClassPathXmlApplicationContext("spring-mvc.xml",
				"spring-dao.xml","bean2.xml");
		
		CustomerMapper customerMapper
			= ac.getBean(CustomerMapper.class);
		
		List<Customer> users = customerMapper.findList();
		for (Customer user : users) {
			System.out.println(user);
		}
		
		ac.close();
	}
	
	@Test
	public void testGetCustomerOrderList() {
		AbstractApplicationContext ac
			= new ClassPathXmlApplicationContext("spring-mvc.xml",
				"spring-dao.xml","bean2.xml");
		
		CustomerMapper customerMapper
			= ac.getBean(CustomerMapper.class);
		
		List<CustomerOrder> users = customerMapper.queryCustomerOrder();
		for (CustomerOrder user : users) {
			System.out.println(user);
		}
		
		ac.close();
	}
  
	
}
