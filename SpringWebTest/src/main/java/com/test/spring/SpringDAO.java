package com.test.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//ojdbc6.jar
//ojdbc14.jar
public class SpringDAO {
	
	private Connection conn;
	private PreparedStatement stat;
	private ResultSet rs;
	
	public SpringDAO() {
		try {
			DBUtil util = new DBUtil();
			conn = util.connect();
		} catch (Exception e) {
			System.out.println("SpringDAO.SpringDAO : " + e.toString());
		}
	}

	public int getCount() {
		
		try {
			
			String sql = "select count(*) as cnt from tblInsa";
			
			stat = conn.prepareStatement(sql);
			rs = stat.executeQuery();
			
			if (rs.next()) {
				return rs.getInt("cnt");
			}
			
		} catch (Exception e) {
			
			System.out.println("SpringDAO.getCount : " + e.toString());
		}
		
		return 0;
	}
	
//	public static void main(String[] args) {
//		SpringDAO dao = new SpringDAO();
//		try {
//			System.out.println(dao.conn.isClosed());
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

}


















