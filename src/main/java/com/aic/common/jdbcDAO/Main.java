package com.aic.common.jdbcDAO;

import java.sql.Connection;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aic.common.dao.jdbc.SimpleJdbcTemplateDao;
import com.aic.common.dao.jdbc.SimpleNamedParameterJdbcTemplateDao;
import com.aic.common.dao.jdbc.impl.SimpleJdbcTemplateDaoImpl;
import com.aic.common.dao.jdbc.impl.SimpleNamedParameterJdbcTemplateDaoImpl;

public class Main {

    private ApplicationContext applicationContext;
    
    public static void main(String[] args) {
	Main main = new Main();
	main.showDbCatlog();
    }
    
    public Connection showDbCatlog() {
	SimpleNamedParameterJdbcTemplateDao simpleDao = applicationContext.getBean(SimpleNamedParameterJdbcTemplateDaoImpl.class);
	
	simpleDao.insert(UUID.randomUUID().toString());
	
	simpleDao.delete(1);
	
	simpleDao.update(2);
	
	//simpleDao.selectAll();
	
	simpleDao.selectWithUuid("dd");
	
	simpleDao.getUuid(2);
	
	simpleDao.showDomainObj(5);
	
	//simpleDao.showDomainObj();
	
	//simpleDao.executeDdl();
	
	simpleDao.executePlSql();
	
	return null;
    }

    public Main() {
	applicationContext = new ClassPathXmlApplicationContext("applicationContext-datasource.xml");
    }

}