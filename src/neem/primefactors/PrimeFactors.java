package neem.primefactors;

import java.util.ArrayList;
import java.util.List;
import java.math.*;

public class PrimeFactors {

	/*
	 * This class finds the prime factors of a user-input number
	 * It has a function that outputs the largest prime factor
	 */
	
	private int maxValue;

	public PrimeFactors(int maxValue) {
		this.maxValue = maxValue;
	}

	public List<Integer> generatePrimesList(int maxValue) {
		List<Integer> generatedPrimes = new ArrayList<Integer>();
		
		int potentialPrime = 2;
		while (maxValue > 1){
			while (maxValue % potentialPrime == 0){
				generatedPrimes.add(potentialPrime);
				maxValue /= potentialPrime;
			}
			potentialPrime += 1;
		}
		
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
