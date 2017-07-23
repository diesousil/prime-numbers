package com.thekilla.primes;

import java.math.BigInteger;

import com.thekilla.primes.search.ErasthothenesSieveSearchMethod;

public class Primes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ErasthothenesSieveSearchMethod mtd = new ErasthothenesSieveSearchMethod(10000);
		mtd.run();
		
		BigInteger[] arrNumber = mtd.getPrimes();
		int[] diffs = new int[arrNumber.length-1];
		
		for(int i=1; i< arrNumber.length;i++) {
			diffs[i-1] = arrNumber[i].subtract(arrNumber[i-1]).intValue();
		}
		
		for(BigInteger num: arrNumber) {
			System.out.print(num);
			System.out.print(" ");
		}
		
		System.out.println();
		
		for(int num : diffs) {
			System.out.print(num);
			System.out.print(" ");
		}
		
		
	}

}
