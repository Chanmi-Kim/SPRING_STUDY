package com.test.spring.di_3;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;

//Ex03_File의 자리를 대신할 사람 = DAO 역할
public class Ex03_DB {
	
	private Connection conn;
	private Statement stat;
	private ResultSet rs;
	
	public Ex03_DB() {
		
		try {
			//Connection : java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver
			//ojdbcXX.jar 파일 없음.
			DBUtil util = new DBUtil();
			conn = util.connect();
			stat = conn.createStatement();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	public ArrayList<String> list() {
		
		try {
			
			String sql = "select data from tblDI";
			
			ArrayList<String> list = new ArrayList<String>();
			
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				list.add(rs.getString("data"));
			}
			
			return list;
					
		} catch (Exception e) {
			
			System.out.println("Ex03_DB.list : " + e.toString());
		}
		
		return null;
	}

}










