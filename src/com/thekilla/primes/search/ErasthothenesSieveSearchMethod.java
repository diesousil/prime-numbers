package com.thekilla.primes.search;

import java.math.BigInteger;


/**
 * @author thekilla
 *
 */
public class ErasthothenesSieveSearchMethod extends AbstractSearchMethod {

	/**
	 * The maximun size of the sieve
	 */
	private int sieveSize;
	
	/**
	 * The sieve array
	 */
	private boolean[] sieve;
	
	/**
	 * Find primes numbers using the Erasthothenes sieve algorithmn.
	 * @param sieveSize the size of the sieve.
	 */
	public ErasthothenesSieveSearchMethod(int sieveSize) {
		super();
		this.setSieveSize(sieveSize);
	}
	
	/**
	 * @return the sieveSize
	 */
	public int getSieveSize() {
		return sieveSize;
	}

	/**
	 * @param sieveSize the sieveSize to set and resize the sieve array size. 
	 * Caution: erases all the sieve progress, so should be used before the algorithmn start.
	 */
	private void setSieveSize(int sieveSize) {
		this.sieveSize = sieveSize;
		this.sieve = new boolean[sieveSize];
	}

	/* (non-Javadoc)
	 * @see com.thekilla.primes.search.AbstractSearchMethod#execute()
	 */
	@Override
	protected int execute() {
		int qtPrimes = 0;
		for(int prime = 2; prime < this.sieveSize; prime++) {

			if(!this.sieve[prime]) {
				qtPrimes++;
				this.updateMultiples(prime);
				this.addPrime(BigInteger.valueOf(prime));
			}
		}
		return qtPrimes;
	}
	
	/**
	 * 
	 * @param primeNumber
	 */
	private void updateMultiples(int primeNumber) {
		for(int mult = primeNumber*2; mult < this.sieveSize; mult+=primeNumber) {
			this.sieve[mult] = true;
		}
	}

	@Override
	public String getName() {
		return "Erasthothenes Sieve";
	}

}
