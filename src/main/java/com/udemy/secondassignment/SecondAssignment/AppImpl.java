/**
 * 
 */
package com.udemy.secondassignment.SecondAssignment;

/**
 * Clase que implementa App.
 * @author lunavi97
 *
 */
public class AppImpl implements App {

	/* (non-Javadoc)
	 * @see com.udemy.secondassignment.SecondAssignment.App#sum(int, int)
	 */
	@Override
	public int sum(int a, int b) throws Exception {
		return a + b;
	}

	/* (non-Javadoc)
	 * @see com.udemy.secondassignment.SecondAssignment.App#subtraction(int, int)
	 */
	@Override
	public int subtraction(int a, int b) throws Exception {
		return a - b;
	}
	
}
