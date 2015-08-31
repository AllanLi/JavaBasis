package com.TryCatchFamily;

class TryCatchThrowSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  
		 */
		try{
			int a=1;
			int b=0;
			
			if( b == 0 ){
				throw new ArithmeticException();
			}			

			System.out.println(a / b);

		}catch (ArithmeticException AE){
			System.out.println("發生算術錯誤進行捕捉");
		}


	}

}
