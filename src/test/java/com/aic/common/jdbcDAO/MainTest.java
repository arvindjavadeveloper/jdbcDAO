package com.aic.common.jdbcDAO;

import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aic.common.dao.jdbc.SimpleJdbcTemplateDao;
import com.aic.common.dao.jdbc.SimpleNamedParameterJdbcTemplateDao;
import com.aic.common.dao.jdbc.impl.SimpleJdbcTemplateDaoImpl;
import com.aic.common.dao.jdbc.impl.SimpleNamedParameterJdbcTemplateDaoImpl;

public class MainTest {

    private ApplicationContext applicationContext;
    
    @org.junit.Test
    public void testConnection() {
	Main obj = new Main();
	Assert.assertNull(obj.showDbCatlog());
    }
    
    /*@org.junit.Test
    public void testCase1() {
	SimpleJdbcTemplateDao simpleDao = applicationContext.getBean(SimpleJdbcTemplateDaoImpl.class);
	Assert.assertNotEquals(0, simpleDao.insert(UUID.randomUUID().toString()));
    }
    
    @org.junit.Test
    public void testCase2() {
	SimpleJdbcTemplateDao simpleDao = applicationContext.getBean(SimpleJdbcTemplateDaoImpl.class);
	simpleDao.delete(1);
    }
    
    @org.junit.Test
    public void testCase3() {
	SimpleJdbcTemplateDao simpleDao = applicationContext.getBean(SimpleJdbcTemplateDaoImpl.class);
	Assert.assertNotEquals(0, simpleDao.update(2));
    }
    
    @org.junit.Test
    public void testCase4() {
	SimpleJdbcTemplateDao simpleDao = applicationContext.getBean(SimpleJdbcTemplateDaoImpl.class);
	Assert.assertNotEquals(0, simpleDao.selectAll());
    }
    
    @org.junit.Test
    public void testCase5() {
	SimpleJdbcTemplateDao simpleDao = applicationContext.getBean(SimpleJdbcTemplateDaoImpl.class);
	Assert.assertNotEquals(0, simpleDao.selectWithUuid("dd"));
    }
    
    @org.junit.Test
    public void testCase6() {
	SimpleJdbcTemplateDao simpleDao = applicationContext.getBean(SimpleJdbcTemplateDaoImpl.class);
	org.junit.Assert.assertNotNull(simpleDao.getUuid(2));
    }
    
    @org.junit.Test
    public void testCase7() {
	SimpleJdbcTemplateDao simpleDao = applicationContext.getBean(SimpleJdbcTemplateDaoImpl.class);
	org.junit.Assert.assertNotNull(simpleDao.showDomainObj(3));
    }
    
    @org.junit.Test
    public void testCase8() {
	SimpleJdbcTemplateDao simpleDao = applicationContext.getBean(SimpleJdbcTemplateDaoImpl.class);
	org.junit.Assert.assertFalse(simpleDao.showDomainObj().isEmpty());
    }*/
    
    public void testCase1() {
	SimpleNamedParameterJdbcTemplateDao simpleDao = applicationContext.getBean(SimpleNamedParameterJdbcTemplateDaoImpl.class);
	Assert.assertNotEquals(0, simpleDao.insert(UUID.randomUUID().toString()));
    }
    
    @org.junit.Test
    public void testCase2() {
	SimpleNamedParameterJdbcTemplateDao simpleDao = applicationContext.getBean(SimpleNamedParameterJdbcTemplateDaoImpl.class);
	simpleDao.delete(1);
    }
    
    @org.junit.Test
    public void testCase3() {
	SimpleNamedParameterJdbcTemplateDao simpleDao = applicationContext.getBean(SimpleNamedParameterJdbcTemplateDaoImpl.class);
	Assert.assertNotEquals(0, simpleDao.update(2));
    }
    
    @org.junit.Test
    public void testCase5() {
	SimpleNamedParameterJdbcTemplateDao simpleDao = applicationContext.getBean(SimpleNamedParameterJdbcTemplateDaoImpl.class);
	Assert.assertNotEquals(0, simpleDao.selectWithUuid("dd"));
    }
    
    @org.junit.Test
    public void testCase6() {
	SimpleNamedParameterJdbcTemplateDao simpleDao = applicationContext.getBean(SimpleNamedParameterJdbcTemplateDaoImpl.class);
	org.junit.Assert.assertNotNull(simpleDao.getUuid(2));
    }
    
    @org.junit.Test
    public void testCase7() {
	SimpleNamedParameterJdbcTemplateDao simpleDao = applicationContext.getBean(SimpleNamedParameterJdbcTemplateDaoImpl.class);
	org.junit.Assert.assertNotNull(simpleDao.showDomainObj(3));
    }
    

    @BeforeClass
    public static void beforeClass() {
	System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass() {
	System.out.println("After class");
    }

    @Before
    public void before() {
	applicationContext = new ClassPathXmlApplicationContext("applicationContext-datasource.xml");
    }

    @After
    public void after() {
	applicationContext = new ClassPathXmlApplicationContext("applicationContext-datasource.xml");
    }

}
