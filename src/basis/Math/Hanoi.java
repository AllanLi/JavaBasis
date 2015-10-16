package basis.Math;

import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入盤數：");
		int n = sc.nextInt();
		Hanoi hanoi = new Hanoi();
		hanoi.move(n,'A','B','C');
	}

	private void move(int n, char A,char B,char C) {
		if(n==1){
			System.out.println("盤"+n+"由"+A+"移至"+C);
		}else{
			move(n-1,A,C,B);
			System.out.println("盤"+n+"由"+A+"移至"+C);
			move(n-1,B,A,C);
		}
		
	}

}
