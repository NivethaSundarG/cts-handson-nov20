package com.org.Spring_JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Employee> {
	
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee es = new Employee();
		es.setId(rs.getInt("ID"));
		es.setName(rs.getString("Name"));
		es.setSalary(rs.getDouble("Salary"));
		return es;
	}

}