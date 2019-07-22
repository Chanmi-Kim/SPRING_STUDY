package com.test.spring.di_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Ex03_File {

	public ArrayList<String> list() {
		
		ArrayList<String> list = new ArrayList<String>();
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("data.db"));
			
			String temp = "";
			
			while ((temp = reader.readLine()) != null) {
				list.add(temp);
			}
			
			reader.close();
			
			return list;
						
		} catch (Exception e) {
			System.out.println("Ex03_File.list : " + e.toString());
		}
		
		return null;
	}

}











