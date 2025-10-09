package com.learning.caseStudy.application;

import com.learning.caseStudy.frameWork.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float charges)
	{
	System.out.println("Hey "+accNm+ " your accno is : "+accNo +" and charges are : "+charges +" and the delivery charges are : "+deliveryCharge );	
	
	}

	@Override
	public String toString() {
		return "GSNormalAcc [deliveryCharge=" + deliveryCharge + ", accNo=" + accNo + ", accNm=" + accNm + ", charges="
				+ charges + "]";
	}
	
	
}