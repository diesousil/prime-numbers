package com.thekilla.primes.operation;

import java.math.BigInteger;
import java.util.List;

/**
 * Encapsulates a operation that can be executed at a prime list.
 * @author thekilla
 *
 */
public abstract class AbstractOperation {

	/**
	 * The Primes list
	 */
	private List<BigInteger> primes;
	
	/**
	 * 
	 * @param primes
	 */
	public AbstractOperation(List<BigInteger> primes) {
		this.setPrimes(primes);
	}

	/**
	 * @return the primes
	 */
	public List<BigInteger> getPrimes() {
		return primes;
	}

	/**
	 * @param primes the primes to set
	 */
	private void setPrimes(List<BigInteger> primes) {
		this.primes = primes;
	}
	
	/**
	 * 
	 */
	protected abstract void execute();
	
	
}
