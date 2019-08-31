package cn.tedu.spring.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;

import cn.tedu.spring.entity.CreditCard;



public class DButil {
 
	 public static Connection getConnection() {
		 BasicDataSource basicDataSource=new BasicDataSource();
		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		// basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		 basicDataSource.setUsername("redis@localhost");
		 basicDataSource.setPassword("Lly486597");
		 basicDataSource.setMaxActive(10);
		 basicDataSource.setInitialSize(3);
		 basicDataSource.setUrl("jdbc:mysql://localhost:3306/test?&characterEncoding=UTF-8");
		 
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultSet=null;
		try {
			 connection =basicDataSource.getConnection();
		/*	 statement =connection.prepareStatement("select * from credit_card");
		 	 resultSet=statement.executeQuery();
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
				
				for(int i=0;i<list.size();i++) {
					CreditCard creditCard=list.get(i);
					System.out.println(creditCard);
				}*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet) {
		if (connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(statement!=null) {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			if(resultSet!=null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	 
	 
	 
}
