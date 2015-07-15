package com.modifiers2;

import com.modifiers1.AccessModifiers;

public class TestMain2 extends AccessModifiers{
	public static void main(String[] args) {
		AccessModifiers a = new AccessModifiers();
		a.v1 = "bv1";
		a.v2 = "bv2";
		System.out.println(a.v1);
		System.out.println(a.v2);
		System.out.println("v3 看不到");
		System.out.println("v4 看不到");			
		
	}

}
