/**
 * 
 */
package com.udemy.secondassignment.SecondAssignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

/**
 * @author lunavi97
 *
 */
public class AppImplTest {

	private static App app;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		app = new AppImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		app = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSum1() throws Exception {
		Assert.assertEquals(2, app.sum(1, 1));
	}
	
	@Test
	public void testSum2() throws Exception {
		Assert.assertEquals(3, app.sum(1, 2));
	}

}
