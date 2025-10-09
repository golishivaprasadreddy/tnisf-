package com.learning.caseStudy.main;

import com.learning.caseStudy.application.*;


public class MainFactory {

	public static void main(String[] args) {
		GSPrimeAcc gsprime = new GSPrimeAcc(1001,"shiva",1953.3f,true);
		GSNormalAcc gsnormal = new GSNormalAcc(1002,"prasad",2499.8f,45.9f);

		gsprime.bookProduct(990.0f);
		gsnormal.bookProduct(299.0f);
	}

}


/*
 * output
 * 
 * Hey shiva your accno is : 1001 your charges are: 990.0 Hey prasad your accno
 * is : 1002 and charges are : 299.0 and the delivery charges are : 45.9
 */