import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;



import cn.tedu.spring.entity.CreditCard;
import cn.tedu.spring.entity.User;
import cn.tedu.spring.util.DButil;

public class TestConnection {
  @Test
  public void testConnec() {
	  ApplicationContext aContext = new ClassPathXmlApplicationContext("spring-dao.xml");
	 BasicDataSource dSource= aContext.getBean("dataSource", BasicDataSource.class);
	try {
		Connection   c= dSource.getConnection();
		Statement statement =c.createStatement();
		ResultSet resultSet =statement.executeQuery("select * from t_users");
		while(resultSet.next()) {
			User user =new User();
			user.setId(resultSet.getInt("id"));
			user.setUsername(resultSet.getString("username"));
			System.out.println(user.getUsername());
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	((AbstractApplicationContext) aContext).close();
  }
  
  
  
  @Test
  public void testSqlSessionFactory() {
	  ApplicationContext aContext = new ClassPathXmlApplicationContext("spring-dao.xml");
	  SqlSessionFactoryBean sessionFactoryBean = aContext.getBean(SqlSessionFactoryBean.class);
	  System.out.println(sessionFactoryBean);
	  ((AbstractApplicationContext) aContext).close();
	  
  }
  
  
  
  @Test
  public void testAllBeans() {
	  ApplicationContext aContext = new ClassPathXmlApplicationContext(new String[] {
		 "bean.xml","bean2.xml","spring-dao.xml","spring-mvc.xml" 
	  });
	 DispatcherServlet dispatcherServlet = new DispatcherServlet((WebApplicationContext) aContext);
	ConfigurableEnvironment sConfigurableEnvironment= dispatcherServlet.getEnvironment();
	System.out.println(sConfigurableEnvironment.getActiveProfiles());
  }

  
@Test
public void testCreditCard() {
	  ApplicationContext aContext = new ClassPathXmlApplicationContext("spring-dao.xml");
	 BasicDataSource dSource= aContext.getBean("dataSource", BasicDataSource.class);
	try {
		Connection   c= dSource.getConnection();
		Statement statement =c.createStatement();
		ResultSet resultSet =statement.executeQuery("select * from credit_card");
	    List<CreditCard> list = new ArrayList<CreditCard>();
		//Map<String, String> map =new HashMap<String, String>();
		while(resultSet.next()) {
			CreditCard cc =new CreditCard();
			cc.setName(resultSet.getString("name"));
			cc.setPhonenumber(resultSet.getString("phonenumber"));
			cc.setMail(resultSet.getString("mail"));
			cc.setBank(resultSet.getString("bank"));
			cc.setCardtype(resultSet.getInt("cardtype"));
			cc.setPassword(resultSet.getString("password"));
			cc.setBillday(resultSet.getInt("billday"));
			cc.setPaydate(resultSet.getInt("paydate"));
			cc.setMaxamount(resultSet.getDouble("maxamount"));
			cc.setInvaliddate(resultSet.getDate("invaliddate"));
			
            list.add(cc);
			
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	((AbstractApplicationContext) aContext).close();
}

@Test
public void testDButil() {
	Connection connection=DButil.getConnection();
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
	String sql="select * from credit_card";
	try {
		preparedStatement=connection.prepareStatement(sql);
		resultSet=preparedStatement.executeQuery();
		 List<CreditCard> list = new ArrayList<CreditCard>();
			//Map<String, String> map =new HashMap<String, String>();
			while(resultSet.next()) {
				CreditCard cc =new CreditCard();
				cc.setName(resultSet.getString("name"));
				cc.setPhonenumber(resultSet.getString("phonenumber"));
				cc.setMail(resultSet.getString("mail"));
				cc.setBank(resultSet.getString("bank"));
				cc.setCardtype(resultSet.getInt("cardtype"));
				cc.setPassword(resultSet.getString("password"));
				cc.setBillday(resultSet.getInt("billday"));
				cc.setPaydate(resultSet.getInt("paydate"));
				cc.setMaxamount(resultSet.getDouble("maxamount"));
				cc.setInvaliddate(resultSet.getDate("invaliddate"));
				
	            list.add(cc);
	            System.out.println(cc);}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}