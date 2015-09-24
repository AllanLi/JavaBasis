package test.lottery;

import java.util.Scanner;

public class LotteryStart {
	/**
	 * 程式進入點
	 * 
	 * @param args
	 *            選擇是哪一種類型,大樂透、今彩539
	 */

	public static void main(String[] args) {
		welcomeMessage(); // 歡迎訊息

		if (args.length == 1) {//若 args 已經有資料,則套用
			LotteryStringClass.userName = args[0];
		} else {
			setUserName();
		}
		System.out.printf(LotteryStringClass.SHOW_USER_WELCOME, LotteryStringClass.userName);
		/*
		 * 顯示清單, 程式進入點結束任務
		 */
		
		LotteryMenu.show();
	}
	
	/**
	 * 設定使用者名稱。(若 args 沒有輸入則不會執行)
	 */
	@SuppressWarnings("resource")
	private static void setUserName() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(LotteryStringClass.SHOW_TYPE_USER_NAME);
		String userName = sc.nextLine();
		while (userName.equals("") || userName.charAt(0) == ' ') {//驗證是否為空字串,或沒輸入
			System.out.print(LotteryStringClass.SHOW_TYPE_USER_NAME_ERROR);
			userName = sc.nextLine();
		}
		LotteryStringClass.userName = userName;
	}

	/**
	 * 歡迎訊息
	 */
	private static void welcomeMessage() {
		System.out.print(LotteryStringClass.SHOW_WELCOME);

	}

}
