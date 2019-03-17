package cn.tedu.spring.config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtil {

	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	private static String initSize;
	private static String maxSize;
	
	private static BasicDataSource dataSource;
	
	static{
		Properties properties = new Properties();
		InputStream inputStream = 
				DBUtil.class.getClassLoader()
				.getResourceAsStream("jdbc.properties");
		try {
			properties.load(inputStream);
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			username = properties.getProperty("username");
			password = properties.getProperty("password");
			initSize = properties.getProperty("initSize");
			maxSize = properties.getProperty("maxSize");
			
			dataSource = new BasicDataSource();
			dataSource.setDriverClassName(driver);
			dataSource.setUrl(url);
			dataSource.setUsername(username);
			dataSource.setPassword(password);
			dataSource.setInitialSize(Integer.parseInt(initSize));
			dataSource.setMaxActive(Integer.parseInt(maxSize));
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	
	public static Connection getConn() throws SQLException{
		
		Connection connection = dataSource.getConnection();
		return connection;
		
	}
	public static void close(Connection conn
			,Statement stat,ResultSet rs){
		 try {
			 if (rs!=null) {
				rs.close();
			 }
			 if (stat!=null) {
				stat.close();
			 }
			 if (conn!=null) {
				conn.setAutoCommit(true);
				conn.close();
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
