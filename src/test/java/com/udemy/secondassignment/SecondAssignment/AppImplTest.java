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
	
	@Test
	public void testSub1() throws Exception {
		assertEquals(0, app.subtraction(1, 1));
	}

	@Test
	public void testSub2() throws Exception {
		assertEquals(-1, app.subtraction(1, 2));
	}
	
	@Test
	public void testSub3() throws Exception {
		assertEquals(5, app.subtraction(2, -3));
	}

}
