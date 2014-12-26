package com.aic.common.dao.jdbc.impl;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.aic.common.dao.domain.Simple;
import com.aic.common.dao.jdbc.SimpleNamedParameterJdbcTemplateDao;

public class SimpleNamedParameterJdbcTemplateDaoImpl implements SimpleNamedParameterJdbcTemplateDao{

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
	return namedParameterJdbcTemplate;
    }
    
    public void setDataSource(DataSource dataSource) {
	this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public int insert(String string) {
	Map<String, String> map = new HashMap<String, String>();
	map.put("uuid", string);
	return namedParameterJdbcTemplate.update("insert into simple (uuid) values (:uuid)", map);
    }

    @Override
    public int update(int i) {
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("id", i);
	return namedParameterJdbcTemplate.update("update simple set uuid='Open Source Lover' where id=:id", map);
    }

    @Override
    public int delete(int i) {
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("id", i);
	return namedParameterJdbcTemplate.update("delete from simple where id=:id", map);
    }

    @Override
    public int selectWithUuid(String uuid) {
	String query = "select count(*) from simple where uuid like :uuid";	
	Map<String, String> map = new HashMap<String, String>();
	map.put("uuid", "%"+uuid+"%");
	SqlParameterSource parameterSource = new MapSqlParameterSource(map);
	int size = namedParameterJdbcTemplate.queryForObject(query, parameterSource, Integer.class);
	return size;
    }

    @Override
    public String getUuid(int i) {
	String query = "select uuid from simple where id = :id";
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("id", i);
	String uuid = namedParameterJdbcTemplate.queryForObject(query, map, String.class);
	return uuid;
    }

    @Override
    public Simple showDomainObj(int i) {
	String query = "select * from simple where id = :id";
	Simple simple = new Simple(new Long(i));
	SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(simple);
	simple = namedParameterJdbcTemplate.queryForObject(query, parameterSource, new QueryRowMapper());
	System.out.println(simple);
	return simple;
    }

    @Override
    public void executePlSql() {
	Map<String, Long> map = new HashMap<String, Long>();
	map.put("id", 1234L);
	namedParameterJdbcTemplate.update("call proc(:id)", map);
    }

}
