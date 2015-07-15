package com.modifiers1;

public class TestMain1 {

	public static void main(String[] args) {
		AccessModifiers a = new AccessModifiers();
		AccessModifiers a1 = new AccessModifiers();
		a.v1 = "av1";
		a.v2 = "av2";		
		a.v3 = "av3";
		//a.v4 = "av4";
		//a.v5 = "av5";
		System.out.println(a.v1);
		System.out.println(a.v2);
		System.out.println(a.v3);
		System.out.println("v4 看不到");
		System.out.println("v5 無法變更變數內容");
		
		//存取記憶體位置的差異
		a.i1 ++;
		System.out.println(a.i1);//存取同一個記憶體位置
		System.out.println(a1.i1);//存取同一個記憶體位置
		a1.i1 ++; 
		System.out.println(a.i1);//存取同一個記憶體位置
		System.out.println(a1.i1);//存取同一個記憶體位置
		
		a.i2 ++;
		System.out.println(a.i2);//存取不同記憶體位置
		System.out.println(a1.i2);//存取不同記憶體位置
		a1.i2 ++; 
		System.out.println(a.i2);//存取不同記憶體位置
		System.out.println(a1.i2);//存取不同記憶體位置
		
	
	}

}
