/**
 * 
 */
package com.udemy.secondassignment.SecondAssignment;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

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

	@Test
	public void testSum1() throws Exception {
		assertEquals(2, app.sum(1, 1));
	}

	@Test
	public void testSum2() throws Exception {
		assertEquals(3, app.sum(1, 2));
	}
	
	@Test
	public void testSum3() throws Exception {
		assertEquals(-1, app.sum(2, -3));
	}

}
