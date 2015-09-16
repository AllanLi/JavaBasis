package basis.II;
/*
 * 菱形,網友提供
 */
import java.util.Scanner;

public class loop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, i, j, k;
		System.out.print("Input any value: ");
		n = scanner.nextInt();
		if (n < 0 || n % 2 != 1) /* 去掉非法輸入 */
		{
			System.out.println("Input must be a positive odd integer.");
			return;
		}
		for (i = 0; i < n; i++) {
			k = Math.abs(i - (n - 1) / 2);
			for (j = 0; j < k; j++)
				/* 縮排 */
				System.out.print(" ");
			for (j = 0; j < n - 2 * k; j++)
				/* 印出星號 */
				System.out.print("*");
			System.out.println(""); /* 換行 */
		}
	}
}
