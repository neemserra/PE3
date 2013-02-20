package neem.primefactors;

import java.util.List;
import java.math.*;

public class PrimeFactors {

	/*
	 * This class finds the prime factors of a user-input number
	 * It has a function that outputs the largest prime factor
	 */
	
	private double maxValue;

	public PrimeFactors(int maxValue) {
		this.maxValue = maxValue;
	}

	public List<Integer> generate(double maxValue) {
		double squareRoot = Math.sqrt(maxValue);
		int highestNumber = (int)squareRoot;
		
		return generatedPrimes;
	}

	public Integer largest(List<Integer> expectedPrimeFactors) {
		Integer largestPrime = 0;
		for (int index = 0; index < expectedPrimeFactors.size(); index++)
			if (expectedPrimeFactors.get(index) > largestPrime){
				largestPrime = expectedPrimeFactors.get(index);
			}
		return largestPrime;
	}

}
