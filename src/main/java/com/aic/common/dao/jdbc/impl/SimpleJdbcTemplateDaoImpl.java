package com.aic.common.dao.jdbc.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.aic.common.dao.domain.Simple;
import com.aic.common.dao.jdbc.SimpleJdbcTemplateDao;

public class SimpleJdbcTemplateDaoImpl implements SimpleJdbcTemplateDao{

    private JdbcTemplate jdbcTemplate;
    
    public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
    }
    
    public void setDataSource(DataSource dataSource) {
	this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @Override
    public int insert(String string) {
	return jdbcTemplate.update("insert into simple (uuid) values (?)", string);
    }
 
    @Override
    public int update(int i) {
	return jdbcTemplate.update("update simple set uuid='Open Source Lover' where id=?", i);
    }
    
    @Override
    public int delete(int i) {
	return jdbcTemplate.update("delete from simple where id=?", i);
    }
    
    @Override
    public int selectAll() {
	int size = jdbcTemplate.queryForObject("select count(*) from simple", Integer.class);
	return size;
    }
    
    @Override
    public int selectWithUuid(String uuid) {
	int size = jdbcTemplate.queryForObject("select count(*) from simple where uuid like ?", Integer.class, "%"+uuid+"%");
	return size;
    }
    
    @Override
    public String getUuid(int i) {
	String uuid = jdbcTemplate.queryForObject("select uuid from simple where id = ?", String.class, i);
	System.out.println(uuid);
	uuid = jdbcTemplate.queryForObject("select uuid from simple where id = ?", new Object[]{i}, String.class);
	return uuid;
    }
    
    @Override
    public Simple showDomainObj(int i) {
	Simple simple = jdbcTemplate.queryForObject("select * from simple where id = ?", new Object[]{i}, new QueryRowMapper());
	return simple;
    }
    
    @Override
    public List<Simple> showDomainObj() {
	List<Simple> simples = jdbcTemplate.query("select * from simple", new QueryRowMapper());
	return simples;
    }
        
    @Override
    public void executeDdl() {
	jdbcTemplate.execute("drop table if exists opensourcelover");
        jdbcTemplate.execute("create table opensourcelover (id bigint, name varchar(100))");
    }
    
    @Override
    public void executePlSql() {
	jdbcTemplate.update("call proc(?)", 1234L);
    }

}