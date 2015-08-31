package com.finalFamily;
/*
 * 成員 (member) 宣告時若使用關鍵字 final 修飾，表示該成員為常數 (constant) 
 * ，屬性 (field) 或區域變數 (local variable) 都不能重新給值，
 * 而方法 (method) 繼承 (inherit) 後不可被改寫 (override) 。
 */


public class FinalSample2 {
	static final double PI = 3.141592653589793;
	public final void test(){
		System.out.println("這是final的方法");
	}
}
	
class finalSample3 extends FinalSample2{

	/*	因為 final 導致繼承關係沒辦法 override 因此，此方法不可運行
	**	public final void test() {
	**   	System.out.println("這是改寫過的final方法");
	**  }
    */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi = 3.141592;
		FinalSample2 fs = new FinalSample2();	
		System.out.println(fs.PI);
		System.out.println(pi);
		fs.test();
		
		//field 或local variable 都不能重新給值，所以此方法不可運行
//		pi = 3.14;
//		System.out.println(fs.PI);
//		System.out.println(pi);
//		fs.test();
	}
}
	


