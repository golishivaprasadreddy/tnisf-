package com.learning.caseStudy.frameWork;



public class PrimeAcc extends ShopAcc{
	
	public boolean isPrime;

	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	
	public void bookProduct(float charges)
	{
		
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
}