package neem.primefactors;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;


public class PrimeFactorsTest {
	private PrimeFactors testObject;
	int maxValue = 13195;
	
	@Before
	public void setUp() {
		testObject = new PrimeFactors(maxValue);	
	}
	
	
	@Test
	public final void testGenerate() {
		//Assemble
		List<Integer> expectedPrimeFactors = Arrays.asList(5, 7, 13, 29);
		
		//Act
		List<Integer> actualPrimeFactors = testObject.generate(maxValue);
		
		//Assert
		assertEquals(expectedPrimeFactors, actualPrimeFactors);
	}

	@Test
	public void testLargest() {
		//Assemble
		List<Integer> expectedPrimeFactors = Arrays.asList(5, 7, 13, 29);
		Integer expectedLargestPrime = 29;
		
		//Act
		Integer actualLargestPrime = testObject.largest(expectedPrimeFactors);
		
		//Assert
		assertEquals(expectedLargestPrime, actualLargestPrime);
	}
}
