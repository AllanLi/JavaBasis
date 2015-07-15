package com.modifiers2;

import com.modifiers1.AccessModifiers;

public class TestMain3{
	public static void main(String[] args) {
		AccessModifiers a = new AccessModifiers();
		a.v1 = "bv1";
		System.out.println(a.v1);
		System.out.println("v2 看不到");
		System.out.println("v3 看不到");
		System.out.println("v4 看不到");			
		
	}

}
