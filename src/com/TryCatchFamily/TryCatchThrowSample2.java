package com.TryCatchFamily;

class TryCatchThrowSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  
		 */
		int a=1;
		int b=0;
		
		if(b==0){
			throw new ArithmeticException();
		}
		
		System.out.println(a / b);

	}

}
