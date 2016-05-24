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
	@Test
	public void OneValueForOneStringTest(){
		
		StringCalculator strcalc = new StringCalculator();
		
		int retVal = strcalc.add("1");
		
		assertEquals(1, retVal);
	}
}
