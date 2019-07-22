package com.test.spring.di_7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class DB implements IWorker {
	
	private Connection conn;
	private Statement stat;
	private ResultSet rs;
	
	public DB() {
		
		try {
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
