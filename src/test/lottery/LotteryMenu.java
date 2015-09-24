package test.lottery;

import java.util.Scanner;

/**
 * 清單
 * 
 * @author Allan
 *
 */
public class LotteryMenu {
	/**
	 * 顯示選單列
	 */
	public static void show() {
		System.out.println(LotteryStringClass.SHOW_MENU_TOP);
		for (int i = 0; i < LotteryStringClass.SHOW_MENU_ITEMS.length; i++) {
			System.out.printf(LotteryStringClass.SHOW_MENU_TYPE, i + 1,
					LotteryStringClass.SHOW_MENU_ITEMS[i]);
		}
		System.out.print(LotteryStringClass.SHOW_MENU_END);
		userKeyIn();// 使用者輸入資料
	}

	/**
	 * 使用者輸入資料(清單號碼)
	 */
	private static void userKeyIn() {
		Scanner sc = new Scanner(System.in);
		System.out.print(LotteryStringClass.SHOW_TYPE_MENU_ITEM);
		String inputString = sc.nextLine(); // 儲存使用者輸入的資料
		while (inputString.length() != 1
				|| inputString.charAt(0) < '1'
				|| inputString.charAt(0) > LotteryStringClass.SHOW_MENU_ITEMS.length + 48) {
			System.out.print(LotteryStringClass.SHOW_TYPE_MENU_ITEM_ERROR);
			inputString = sc.nextLine();
		}
		LotteryMenuMethod.methods(inputString.charAt(0) -48 );

	}

}
