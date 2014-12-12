package com.aic.common.jdbcDAO;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

public class MainTest {

    private List<String> list;
    
    @org.junit.Test
    public void testConnection() {
	Main obj = new Main();
	System.out.println("Connectino null");
	Assert.assertNotNull(obj.showDbCatlog());
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
	list = new ArrayList<String>(0);
	System.out.println("Before");
    }

    @After
    public void after() {
	System.out.println("After");
    }

   /* @org.junit.Test
    public void isEmpty() {
	org.junit.Assert.assertTrue(list.isEmpty());
	System.out.println("isEmpty");
    }

    @org.junit.Test
    public void add() {
	list.add("Arvind");
	System.out.println("add");
    }*/

}
