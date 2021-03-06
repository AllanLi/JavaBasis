package test.lottery;

import org.magiclen.guessnumber.ComputerPlayer;
import org.magiclen.guessnumber.Player;

/**
 * 清單(Menu)所搭配連結的方法
 * 
 * @author Allan
 */
public class LotteryMenuMethod {
	/**
	 * 將從清單(Menu)傳來的選項值利用 switch 關鍵字套用至對應的方法
	 */
	public static int methods(int index) {
		/**
		 * 宣告變數
		 */
		int numberRange ;//數字範圍
		int numberAmount;//數字數量
		String B;

		/**
		 * 選擇要執行的方法
		 */
		switch (index) {
		case 1:// 大樂透
			numberRange  = 49;
			numberAmount = 6;
			System.out.print(LotteryStringClass.SHOW_GAME_BIG_LOTTERY);
			B = LotteryGenerate.numberRandom(numberRange,numberAmount);

			System.out.println("§");
			System.out.println("§ 號碼: " + B);
			System.out.print("§");
			System.out.println();
			
			break;
		case 2:// 今彩539
			numberRange  = 39;
			numberAmount = 5;
			System.out.print(LotteryStringClass.SHOW_GAME_WONDERFUL_539);
			B = LotteryGenerate.numberRandom(numberRange,numberAmount);
			System.out.println("§");
			System.out.println("§ 號碼: " + B);
			System.out.print("§");
			System.out.println();
			break;
		case 3:// 大福彩
			numberRange  = 40;
			numberAmount = 7;
			System.out.print(LotteryStringClass.SHOW_GAME_BIG_BLISS);
			B = LotteryGenerate.numberRandom(numberRange,numberAmount);
			System.out.println("§");
			System.out.println("§ 號碼: " + B);
			System.out.print("§");
			System.out.println();
			break;
		case 4:// 玩法說明
			break;

		case 5: // 離開選單
			System.out.print(LotteryStringClass.SHOW_EXIT_MENU);
			if (Tools.YorN()) {
				System.out.printf(LotteryStringClass.SHOW_EXIT,
						LotteryStringClass.userName);// 顯示結束訊息
				return 0;
			} else {
				System.out.println(LotteryStringClass.SHOW_WELCOME_BACK);
			}
		}
		LotteryMenu.show();// 顯示選單
		return 0;
	}

}
