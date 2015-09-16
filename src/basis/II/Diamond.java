package basis.II;

/*
 * 畫出菱形圖案
 */
import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n, i, j, k, q;
		System.out.print("請輸入高度：");
		n = scanner.nextInt();
		if (n < 0 || n % 2 != 1) {
			System.out.println("請輸入奇數" + n);
			return;
		}
		/*
		 * 菱形
		 */
		for (i = 0; i < n; i++) {
			k = Math.abs(i - (n - 1) / 2);
			q = Math.abs((n - 1) / 2);
			// System.out.print("k: "+k);
			// 空白
			for (j = 0; j < k + q; j++) {
				System.out.print(" ");
			}
			// 星星
			for (j = 0; j < n - 2 * k; j++) {
				System.out.print("*");
			}
			// 換行
			System.out.println("");
		}
		/*
		 * 三角形
		 */
		int a, b, c, d;
		for (a = 0; a < n; a++) {
			b = n - a - 1;
			// System.out.print("b: "+b);
			// 計算要幾個空白
			for (c = 0; c < b; c++) {
				System.out.print(" ");
			}
			// 計算要幾個星星
			for (d = 1; d < (n - b) * 2; d++) {
				System.out.print("*");
			}
			// 換行
			System.out.println("");
		}
	}
}
