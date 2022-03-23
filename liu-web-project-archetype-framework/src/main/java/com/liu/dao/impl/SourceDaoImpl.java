package com.liu.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.liu.pojo.Source;

@Repository("sourceDao")
public class SourceDaoImpl {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public List<Source> queryList() {

		String sql = "select id, name, type, buyDate from tb_source";

		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Source>(Source.class));
	}

	
	public Source queryById(Integer id) {

		String sql = "select id, name, type, buyDate, price from tb_source where id=" + id;

		
		if(0 == queryCountById(id))
			return null;
		
		return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {

			Source o = new Source();
			o.setId(rs.getInt("id"));
			o.setName(rs.getString("name"));
			o.setType(rs.getString("type"));
			o.setBuyDate(rs.getDate("buyDate"));
			o.setPrice(rs.getInt("price"));

			return o;
		});
	}
	

	public Long queryCountById(Integer id) {

		String sql = "select count(*) c from tb_source ";

		if (null != id)
			sql += "where id=" + id;

		return (Long) jdbcTemplate.queryForMap(sql).get("c");

	}

	
	public int add(Source o) {

		String sql = "insert into tb_source(name, type, buyDate, price) values(?, ?, ?, ?)";

		return jdbcTemplate.update(sql, o.getName(), o.getType(), o.getBuyDate(), o.getPrice());
	}

}
