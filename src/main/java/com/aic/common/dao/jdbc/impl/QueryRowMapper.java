package com.aic.common.dao.jdbc.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.aic.common.dao.domain.Simple;

public class QueryRowMapper implements RowMapper<Simple>{
	@Override
	public Simple mapRow(ResultSet resultSet, int i) throws SQLException {
	    Simple simple = new Simple();
	    simple.setId(resultSet.getLong("id"));
	    simple.setUuid(resultSet.getString("uuid"));
	    return simple;
	}
}