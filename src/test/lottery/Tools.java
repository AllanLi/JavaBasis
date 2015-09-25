package test.lottery;

import java.util.Scanner;

/**
 * 好用工具包
 * 
 * @author Allan
 *
 */
public class Tools {
	/**
	 * 只能輸入Y 或 N 的判斷式，若非則重新要求輸入
	 * @return 輸入 Y=true 、N=false 
	 */
	public static boolean YorN() {
		Scanner sc = new Scanner(System.in);
		String inputYN = sc.nextLine();
		while(inputYN.length() != 1 || (inputYN.toUpperCase().charAt(0) != 'Y' && inputYN.toUpperCase().charAt(0) != 'N')){
			System.out.print("輸入有誤，請重新輸入[Y/N]：");
			inputYN = sc.nextLine();
		}
		return inputYN.toUpperCase().charAt(0) == 'Y';
	}
}
