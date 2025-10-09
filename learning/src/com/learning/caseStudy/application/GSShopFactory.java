package com.learning.caseStudy.application;

import com.learning.caseStudy.frameWork.*;

public class GSShopFactory implements ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAcc(int accNo,String accNm,float charges,boolean isPrime) {
		PrimeAcc pri = new PrimeAcc(accNo,accNm,charges,isPrime);
		return pri;
	}


	public NormalAcc getNewNormalAcc(int accNo,String accNm,float charges,float deliveryCharge) {
		NormalAcc normal = new NormalAcc(accNo,accNm,charges,deliveryCharge);
		return normal;
	}

	

	

	
	
}