import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.component.FactoryMethodComponent;
import cn.tedu.spring.config.AppConfig;
import cn.tedu.spring.config.DBUtil;
import cn.tedu.spring.config.MovieConfiguration;
import cn.tedu.spring.controller.CatController;
import cn.tedu.spring.controller.LuNongYunController;
import cn.tedu.spring.entity.Cat;
import cn.tedu.spring.entity.Dog;
import cn.tedu.spring.entity.Duck;
import cn.tedu.spring.entity.Elephant;
import cn.tedu.spring.entity.LuNongYun;
import cn.tedu.spring.entity.Movie;
import cn.tedu.spring.entity.Picture;
import cn.tedu.spring.entity.Tyson;
import cn.tedu.spring.service.UserServiceImpl;

public class TestIoc {
  
	

	@Test
	public void SelectUser(){
		Connection conn=null;
		PreparedStatement ps =null;
		ResultSet rs =null;
		String sql="SELECT * FROM user";
		try {
			conn= DBUtil.getConn();
		ps =	conn.prepareStatement(sql);
		rs=ps.executeQuery();	
		while(rs.next()) {
			String name=rs.getString("name");
		System.out.println(name);
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBUtil.close(conn, ps, rs);
	}
	
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
	     Movie movie =  (Movie) ac.getBean("movie",Movie.class);
	     
	     Dog dog = ac.getBean(Dog.class);
	     System.out.println(dog.getName());
	     System.out.println(movie.getName());
	     ((AbstractApplicationContext) ac).close();
	}
	
	@Test
	public void testDuckBean() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Duck duck = ac.getBean(Duck.class);
        System.out.println(duck.getName());
        ((AbstractApplicationContext) ac).close();
        
	}
	@Test
	public void testcat() {
		ApplicationContext aContext =new AnnotationConfigApplicationContext("cn.tedu.spring.config");
		 Cat cat =aContext.getBean(Cat.class);
		System.out.println(cat);
		((AbstractApplicationContext) aContext).close();
	}
	
	@Test
	public void testLunongyun() {
		ApplicationContext aContext =new ClassPathXmlApplicationContext("bean.xml");
		 LuNongYunController luNongYun =aContext.getBean(LuNongYunController.class);
          luNongYun.run();
          ((AbstractApplicationContext) aContext).close();
	}
	
	/**
	 * 测试注解@resouce跟据name自动连接 
	 */
	@Test
	public void testPicture() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
		Picture picture=applicationContext.getBean(Picture.class);
        System.out.println(picture);
        System.out.println(picture.getPen());
		  ((AbstractApplicationContext) applicationContext).close();
	}
	
	/**
	 * 测试filter 包浏览 
	 * include filter  代表可以实例化 
	 * exclude filter  不可以实例化
	 */
	@Test
	public void testScan() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("cn.tedu.spring.config");
		UserServiceImpl dog =applicationContext.getBean(UserServiceImpl.class);
		//CatController cat =applicationContext.getBean(CatController.class);
		System.out.println("filter"+dog);
		 ((AbstractApplicationContext) applicationContext).close();
	}
	/**
	 * 测试component注解中包含bean注解
	 */
	@Test
	public void testComponentMetadata() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean2.xml");
		FactoryMethodComponent factoryMethodComponent=applicationContext.getBean(FactoryMethodComponent.class);
         System.out.println(factoryMethodComponent);
		 ((AbstractApplicationContext) applicationContext).close();
	}
	/**
	 * ?
	 */
	@Test
	public void testBeanNameGenerator() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryMethodComponent.class);
		Tyson tyson=applicationContext.getBean(Tyson.class);
		System.out.println(tyson);
		((AbstractApplicationContext) applicationContext).close();
	}
	
	@Test
	public void testRegister() {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(MovieConfiguration.class);
		annotationConfigApplicationContext.register(AppConfig.class);
		annotationConfigApplicationContext.scan("cn.tedu.spring.entity");
		
		annotationConfigApplicationContext.refresh();
		UserServiceImpl userServiceImpl =annotationConfigApplicationContext.getBean(UserServiceImpl.class);
		Elephant elephant = annotationConfigApplicationContext.getBean(Elephant.class);
		System.out.println(elephant);
//		Duck duck = annotationConfigApplicationContext.getBean(Duck.class);
//		System.out.println(duck);
	System.out.println(userServiceImpl);
	Cat cat =	annotationConfigApplicationContext.getBean(Cat.class);
	System.out.println(cat);
	annotationConfigApplicationContext.close();
		
	}
}
