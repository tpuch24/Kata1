/**
 * 
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class StringCalculatorTest {
	
	private static final String TWO_INT_VALUES_STRING = "1,2";
	private static final String ONE_INT_VALUE_STRING = "8";
	private static final String EMPTY_STRING = "";
	private StringCalculator stringCalculator;
	
	@Before
	public void init(){
		stringCalculator = new StringCalculator();
	}
	@Test
	public void nullValueForEmptyStringTest(){
		
		assertEquals(0, stringCalculator.add(EMPTY_STRING));
	}
	
	@Test
	public void OneValueForOneStringTest(){
		
		assertEquals(8, stringCalculator.add(ONE_INT_VALUE_STRING));
	}
	
	@Test
	public void ValueForTwoIntStringTest(){
		
		assertEquals(3, stringCalculator.add(TWO_INT_VALUES_STRING));
	}
}
