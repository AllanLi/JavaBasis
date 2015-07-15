package com.modifiers1;
/*
 * JAVA 修飾符
 * public		皆可存取
 * protected	同一個package的class才可存取，不同的package得要有繼承關係才可存取
 * default 無修飾	同一個package的class才可存取
 * private		同一個class才可存取
 */
public class AccessModifiers {
	//權限的差異
	public static String v1  = "v1=public";
	protected static String v2 = "v2=protected";
	static String v3 = "v3=default"; 
	private static String v4 = "v4=private";
	//final 的使用在任何地方皆無法進行變數的變更
	public static final String v5  = "v5=public+final";	
	//存取記憶體位置的差異
	static int i1 = 100; 
	int i2 = 100;
	
	public static void main(String[] args) {
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
	}
}

