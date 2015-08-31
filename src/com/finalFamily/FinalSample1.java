package com.finalFamily;

public class FinalSample1 {
	static final double PI = 3.141592653589793;
	public final void test(){
		System.out.println("這是final的方法");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi = 3.141592;
		FinalSample1 fs = new FinalSample1();	
		System.out.println(fs.PI);
		System.out.println(pi);
		fs.test();
		
		//重新給值，錯誤方法示範
//		pi = 3.14;
//		System.out.println(fs.PI);
//		System.out.println(pi);
//		fs.test();
	}

}
