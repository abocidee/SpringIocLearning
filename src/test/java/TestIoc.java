import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.config.DBUtil;
import cn.tedu.spring.controller.LuNongYunController;
import cn.tedu.spring.entity.Cat;
import cn.tedu.spring.entity.Dog;
import cn.tedu.spring.entity.Duck;
import cn.tedu.spring.entity.LuNongYun;
import cn.tedu.spring.entity.Movie;

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
		System.out.println(cat.getName());
		((AbstractApplicationContext) aContext).close();
	}
	
	@Test
	public void testLunongyun() {
		ApplicationContext aContext =new ClassPathXmlApplicationContext("bean.xml");
		 LuNongYunController luNongYun =aContext.getBean(LuNongYunController.class);
          luNongYun.run();
          ((AbstractApplicationContext) aContext).close();
	}
}
