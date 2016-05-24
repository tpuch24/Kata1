/**
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;



public class StringCalculatorTest {

	@Test
	public void nullValueForEmptyStringTest(){
		
		StringCalculator strcalc = new StringCalculator();
		
		int retVal = strcalc.add("");
		
		assertEquals(0, retVal);
		
		
	}
}
