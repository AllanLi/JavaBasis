package basis.II;

import java.util.Scanner;

/*
 * 
 * * 漏斗型
 *
 */
public class Funnel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in, i, j, k;
//		System.out.println("請輸入高度：");
//		in = sc.nextInt();
		in = 11;
		if(in <0 || in %2 !=1 ){
			System.out.println("請輸入奇數"+ in);
			return ;
		}
		/*
		 * 漏斗
		 */
		for( i=0; i< in ; i++ ){
			k = Math.abs((in -1)/2) ;
			System.out.print("i"+i);
			System.out.println(",k"+k);
			for( j=0; j<k ; j++ ){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
