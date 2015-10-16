package basis.Math;
/**
 * 費氏數列
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("輸入一個數：");
		int nu = sc.nextInt();
		Fibonacci fc = new Fibonacci();
		for(int i = 0; i < nu; i++){
			System.out.println(fc.get(i) + "");
		}

	}

	Integer get(int n) {
		if(n >= fib.size()) for(int i= fib.size(); i <= n ; i++){
			fib.add(fib.get(i-1) + fib.get(i -2));
		}
		return fib.get(n);
	}
	
	private List<Integer> fib = new ArrayList<>(); {
		fib.add(0);
		fib.add(1);
	}

}
