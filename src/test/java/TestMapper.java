import java.util.List;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.spring.entity.User;
import cn.tedu.spring.mapper.UserMapper;

public class TestMapper {
	
	@Test
	public void testUpdateUserInfo() {
		AbstractApplicationContext ac
		= new ClassPathXmlApplicationContext(
				"spring-dao.xml");
		
		UserMapper userMapper
			= ac.getBean(
				"userMapper", UserMapper.class);
		
		Integer id = 1;
		Integer age = 22;
		User user = new User();
		user.setId(id);
		user.setAge(age);
		Integer affectedRows
			= userMapper.update(user);
		System.out.println(
				"affectedRows=" + affectedRows);
		
		id = 2;
		String password = "billy123";
		user = new User();
		user.setId(id);
		user.setPassword(password);
		affectedRows = userMapper.update(user);
		System.out.println(
			"affectedRows=" + affectedRows);
	
		
		ac.close();
	}
	
	@Test
	public void testUpdateAge() {
		AbstractApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"spring-dao.xml");
		
		UserMapper userMapper
			= ac.getBean(
				"userMapper", UserMapper.class);
		
		Integer id = 19;
		Integer age = 21;
		Integer affectedRows
			= userMapper.updateAge(id, age);
		System.out.println(
			"affectedRows=" + affectedRows);
		
		ac.close();
	}
	
	@Test
	public void testChangePassword() {
		AbstractApplicationContext ac
		= new ClassPathXmlApplicationContext(
				"spring-dao.xml");
		
		UserMapper userMapper
		= ac.getBean(
				"userMapper", UserMapper.class);
		
		Integer id = 19;
		String newPassword = "password19";
		Integer affectedRows
		= userMapper.changePassword(id, newPassword);
		System.out.println(
				"affectedRows=" + affectedRows);
		
		ac.close();
	}
	
	@Test
	public void testDelete() {
		AbstractApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"spring-dao.xml");
	
		UserMapper userMapper
			= ac.getBean(
				"userMapper", UserMapper.class);
		
		Integer id = 16;
		Integer affectedRows
			= userMapper.delete(id);
		System.out.println(
			"affectedRows=" + affectedRows);
		
		ac.close();
	}
	
	@Test
	public void testFindUserByUsername() {
		AbstractApplicationContext ac
		= new ClassPathXmlApplicationContext(
				"spring-mvc.xml",
				"spring-dao.xml");
		
		UserMapper userMapper
		= ac.getBean(
				"userMapper", UserMapper.class);
		
		String username = "Jack8";
		User user = userMapper.findUserByUsername(username);
		System.out.println(user);
		
		ac.close();
	}
	
	@Test
	public void testGetUserList() {
		AbstractApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"spring-mvc.xml",
				"spring-dao.xml","bean2.xml");
		
		UserMapper userMapper
			= ac.getBean(
				"userMapper", UserMapper.class);
		
		List<User> users = userMapper.getUserList();
		for (User user : users) {
			System.out.println(user);
		}
		
		ac.close();
	}

	@Test
	public void testReg() {
		AbstractApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"spring-mvc.xml",
				"spring-dao.xml");
		
		UserMapper userMapper
			= ac.getBean(
				"userMapper", UserMapper.class);
		
		User user = new User();
		user.setUsername("Tom3");
		user.setPassword("123456");
		Integer affectedRows
			= userMapper.reg(user);
		System.out.println(
			"affectedRows=" + affectedRows);
		
		Integer id = user.getId();
		 System.out.println("user id=" + id);
		
		  ac.close();
	}
	
  
	
}
