package org.jfree.data.test;
import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeGetUpperBoundMethodTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This tests are realated to Method: getUpperBound of Class Range.");
	}

	@Before
	public void setUp() throws Exception {}

    @Test
    public void testGetUpperBound_PositiveRange_ReturnsCorrectUpperBound() {
        Range range = new Range(1.0, 10.0);
        double result = range.getUpperBound();
        assertEquals("The upper bound of a positive range [1.0, 10.0] should be 10.0", 10.0, result, 0.0);
    }
    
    @Test
    public void testGetUpperBound_NegativeRange_ReturnsCorrectUpperBound() {
        Range range = new Range(-10.0, -1.0);
        double result = range.getUpperBound();
        assertEquals("The upper bound of a negative range [-10.0, -1.0] should be -1.0", -1.0, result, 0.0);
    }
    
    @Test
    public void testGetUpperBound_ZeroRange_ReturnsCorrectUpperBound() {
        Range range = new Range(0.0, 0.0);
        double result = range.getUpperBound();
        assertEquals("The upper bound of a zero range [0.0, 0.0] should be 0.0", 0.0, result, 0.0);
    }
    
    @Test
    public void testGetUpperBound_InfiniteRange_ReturnsCorrectUpperBound() {
        Range range = new Range(1.0, Double.POSITIVE_INFINITY);
        double result = range.getUpperBound();
        assertEquals("The upper bound of a range with positive infinity [1.0, Infinity] should be Infinity", Double.POSITIVE_INFINITY, result, 0.0);
    }
    
    @Test
    public void testGetUpperBound_InfiniteReversedRange_ReturnsCorrectUpperBound() {
        Range range = new Range(Double.NEGATIVE_INFINITY, 1.0);
        double result = range.getUpperBound();
        assertEquals("The upper bound of a range with negative infinity to 1.0 should be 1.0", 1.0, result, 0.0);
    }
    
	
	@After
	public void tearDown() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}