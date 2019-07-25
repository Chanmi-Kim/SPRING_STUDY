package com.test.spring;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MemoDAO implements IMemo {

	//JDBC -> Spring JDBC -> MyBatis(iBatis)
	private DriverManagerDataSource dataSource; //Connection 역할
	private JdbcTemplate template; //Statement + ResultSet 역할
	
	public MemoDAO() {
		//DB 연결 > XML 이동
		this.dataSource = new DriverManagerDataSource();
		this.dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		this.dataSource.setUrl("jdbc:oracle:thin:@localhost:1522:xe");
		this.dataSource.setUsername("hr");
		this.dataSource.setPassword("java1234");
		
		//template 생성
		this.template = new JdbcTemplate(this.dataSource);
		//this.template.setDataSource(dataSource);
	}
	
	
	
	@Override
	public int add(MemoDTO dto) {
		
		//Spring JDBC 방식 == PreparedStatement 방식 + 업그레이드
		String sql = "insert into tblMemo (seq, name, memo, regdate, category) values (memo_seq.nextval, ?, ?, default, ?)";
		
		//SQL 실행
		//stat.executeUpdate() == template.update()
		//stat.executeQuery() == template.query()
		
		//Object[] args = new Object[3];
		//args[0] = dto.getName();
		//args[1] = dto.getMemo();
		//args[2] = dto.getCategory();
		
		return this.template.update(sql, new Object[] { dto.getName(), dto.getMemo(), dto.getCategory() });
	}
	
	
	@Override
	public List<MemoDTO> list() {
		
		String sql = "select * from tblMemo order by seq desc";
				
		return this.template.query(sql, new BeanPropertyRowMapper<MemoDTO>(MemoDTO.class));
	}
	
	
	
	@Override
	public MemoDTO get(String seq) {
		
		String sql = "select * from tblMemo where seq = ?";

		//Spring JDBC
		//1. 인자값 > new Object[]
		//2. 반환값
		//		a. query() : List<DTO> 1개
		//		b. queryForObject() : DTO 1개
		//		c. queryForInt() : 정수 1개
		
		return this.template.queryForObject(sql, new Object[] {seq}, new BeanPropertyRowMapper<MemoDTO>(MemoDTO.class));
	}
	
	
	@Override
	public int edit(MemoDTO dto) {
		
		String sql = "update tblMemo set name = ?, memo = ?, category = ? where seq = ?";
		
		return this.template.update(sql, new Object[] {dto.getName(), dto.getMemo(), dto.getCategory(), dto.getSeq()});
	}
	
	
	@Override
	public int del(String seq) {
		
		String sql = "delete from tblMemo where seq = ?";
		
		return this.template.update(sql, new Object[] {seq});
	}
	
}











