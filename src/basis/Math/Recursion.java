package basis.Math;

import java.util.Scanner;

/**
 * 遞迴
 * @author Allen
 *
 */
public class Recursion {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("輸入兩數：");
		System.out.print("m =");
		int m = sn.nextInt();
		System.out.print("n =");
		int n = sn.nextInt();
		System.out.println("數列:" + fib(m,n));
		System.out.println("數列二:" + fib2(m,n));

	}

	private static int fib2(int m, int n) {
		int r = 0;
		while(n != 0){
			r = m % n;
			m = n;
			n = r;
		}
		return m;
	}

	private static int fib(int m, int n) {
		if(n==0)
			return m;
		else
			return fib(n, m%n );
	}

}
