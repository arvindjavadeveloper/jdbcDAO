package com.aic.common.jdbcDAO;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private ApplicationContext applicationContext;
    
    public static void main(String[] args) {
	Main main = new Main();
	main.showDbCatlog();
    }
    
    public Connection showDbCatlog() {
	DataSource dataSource = applicationContext.getBean(DataSource.class);
	try {
	    System.out.println(dataSource.getConnection().getCatalog());
	    return dataSource.getConnection();
	} catch (SQLException e) {
	    e.printStackTrace();
	    return null;
	}
	
    }

    public Main() {
	applicationContext = new ClassPathXmlApplicationContext("applicationContext-datasource.xml");
    }

}