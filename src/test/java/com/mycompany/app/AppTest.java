package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;
import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

   
  

    public void testEqual() {
      ArrayList<Integer> array_1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array_2 = new ArrayList<>(Arrays.asList(4, 4, 2, 1));
      assertTrue(new App().compare_array_indexes(array_1, array_2, 1, 2));
    }

    public void testNotEqual() {
      ArrayList<Integer> array_1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array_2 = new ArrayList<>(Arrays.asList(4, 4, 2, 1));
      assertFalse(new App().compare_array_indexes(array_1, array_2, 1, 0));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array_1 = new ArrayList<>();
      ArrayList<Integer> array_2 = new ArrayList<>(Arrays.asList(4, 4, 2, 1));
      assertFalse(new App().compare_array_indexes(array_1, array_2, 1, 3));
    }

    public void testNull() {
      assertFalse(new App().compare_array_indexes(null, null, 3, 4));
    }

    public void testGivenIntBigger() {
      ArrayList<Integer> array_1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array_2 = new ArrayList<>(Arrays.asList(4, 4, 2, 1));
      assertFalse(new App().compare_array_indexes(array_1, array_2, 8, 0));
    }

}
