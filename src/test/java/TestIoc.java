import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;



import cn.tedu.spring.config.DBUtil;

public class TestIoc {
  
	@Test
	public void SelectUser(){
		Connection c=null;
		PreparedStatement ps =null;
		ResultSet rs =null;
		String sql="SELECT * FROM user";
		try {
		    c= DBUtil.getConn();
		ps =	c.prepareStatement(sql);
		rs=ps.executeQuery();	
		while(rs.next()) {
			String name=rs.getString("name");
		System.out.println(name);
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
