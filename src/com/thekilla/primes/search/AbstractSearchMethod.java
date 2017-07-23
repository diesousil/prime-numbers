package com.thekilla.primes.search;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

/**
 * Encapsulates a primes search method.
 * @author thekilla
 *
 */
public abstract class AbstractSearchMethod {
	
	/**
	 * The primes list
	 */
	private List<BigInteger> primes;
	
	/**
	 * Time expended executing the search
	 */
	private long executionTime;
	
	/**
	 * Instantiates the primes list , executes the search method and count its execution time.
	 */
	public AbstractSearchMethod() {
		this.setPrimes(new LinkedList<BigInteger>());		
	}
	
	/**
	 * Runs the search method
	 */
	public void run() {
		long time = System.currentTimeMillis();
		this.execute();
		this.setExecutionTime(System.currentTimeMillis() - time);
	}
	
	/**
	 * @return the primes list
	 */
	public BigInteger[] getPrimes() {
		return primes.toArray(new BigInteger[this.primes.size()]);
	}

	/**
	 * @param primes the primes to set
	 */
	private void setPrimes(List<BigInteger> primes) {
		this.primes = primes;
	}

	/**
	 * @return the executionTime
	 */
	public long getExecutionTime() {
		return executionTime;
	}

	/**
	 * @param executionTime the executionTime to set
	 */
	private void setExecutionTime(long executionTime) {
		this.executionTime = executionTime;
	}
	
	/**
	 * Adds a prime number to the list
	 * @param prime the prime  number to be add
	 */
	protected void addPrime(BigInteger prime) {
		this.primes.add(prime);
	}
	
	/**
	 * @return the method's name
	 */
	public abstract String getName();

	/**
	 * @return the amount of primes found
	 */
	protected abstract int execute();
	
	/**
	 * The method information as string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		
		str.append("Method: ");
		str.append(this.getName());

		str.append("\nTime: ");
		str.append(this.getExecutionTime());
		str.append(" miliseconds");
		
		str.append("\nNumbers Found: ");
		str.append(this.getPrimes().length);
		
		return str.toString();
	}

}
