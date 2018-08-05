package com.udemy.secondassignment.SecondAssignment;

/**
 * Interface App.
 * @author lunavi97
 *
 */
public interface App 
{
    /**
     * @param a
     * @param b
     * @return la suma de a y b
     * @throws Exception
     */
    public abstract int sum(final int a, final int b) throws Exception;
    
    /**
     * @param a
     * @param b
     * @return la resta de a y b
     * @throws Exception
     */
    public abstract int subtraction(final int a, final int b) throws Exception;
}
