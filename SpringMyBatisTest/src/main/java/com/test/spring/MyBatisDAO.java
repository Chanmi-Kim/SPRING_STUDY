package com.test.spring;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyBatisDAO {
	
	//JDBC : Connection, Statement, ResultSet
	//Spring-JDBC : DriverManagerDataSource, JdbcTemplate
	//MyBatis : SqlSessionTemplate(SqlSesssionFactoryBean, BasicDataSource)
	@Autowired
	private SqlSessionTemplate template;

	public void m1() {
		
		//String sql -> execute() -> return
		
		//template.update()
		//template.insert()
		//template.delete()
		//template.select()
		template.update("test.m1"); //매퍼 파일에 있는 test라는 네임스페이스 내부의 m1이라는 아이디를 가진 쿼리를 호출
	}

	public int m2(String seq) {
		
		return template.update("test.m2", seq);
	}

	public int m3(HashMap<String, String> map) {
		
		return template.insert("test.m3", map);
	}

	public int m4(MyBatisDTO dto) {
		
		return template.insert("test.m4", dto);
	}

	public int m5() {
		
		//selectOne() : 단일 레코드 : if (rs.next())
		//selectList() : 다중 레코드 : while (rs.next())
		return template.selectOne("test.m5");
	}

	public MyBatisDTO m6(String num) {
		
		return template.selectOne("test.m6", num);
	}

	public List<String> m7() {
		
		//selectOne() + resultType="String" -> return String
		//selectList() + resultType="String" -> return List<String>
		
		//Mapper에서는 단일 행의 반환타입만 resultType에 명시한다.
		//돌려주는 결과가 단일 타입인지 배열 타입인지는 selectOne() or selectList() 메소드가 결정한다.
		
		
		//selectOne() : 단일 레코드 : if (rs.next())
		//selectList() : 다중 레코드 : while (rs.next())
		return template.selectList("test.m7");
	}

	public List<MyBatisDTO> m8(String buseo) {
		
		return template.selectList("test.m8", buseo);
	}

}











