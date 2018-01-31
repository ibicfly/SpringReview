package com.ibicfly.test.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HelloDao  {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public String getName(int id) {
		System.out.println("进入HelloDao");
		String name="cyh"+id;
		jdbcTemplate.update("insert into user values(?,?)",new Object[] {id,name});
		  return  (String) jdbcTemplate.queryForList("select username from user where id = ?",
					new Object[]{id}).get(0).get("username");
	}
}
