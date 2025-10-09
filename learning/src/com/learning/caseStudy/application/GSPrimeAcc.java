package com.learning.caseStudy.application;

import com.learning.caseStudy.frameWork.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	public void bookProduct(float charges)
	{
		System.out.println("Hey "+accNm+ " your accno is : "+accNo+ " your charges are: "+charges);
	}
	@Override
	public String toString() {
		return "GSPrimeAcc [isPrime=" + isPrime + ", accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges
				+ "]";
	}
	
	
}