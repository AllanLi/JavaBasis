package test.lottery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LotteryGenerate {

	public static void numberRandom(int numberRange, int numberAmount) {
		System.out.print(LotteryStringClass.SHOW_GAME_BIG_LOTTERY);
		boolean[] numberStatus = new boolean[numberRange +1];//將 numberRange 數字範圍產生為一陣列並以 boolean 型態紀錄
		int[] data = new int[numberAmount];//將 numberAmount 數字數量產生為一陣列用以紀錄
		
		List<Integer> list = new ArrayList<>();// 創建一個 List

		for (int i = 0; i < data.length;) { //依據 data 的長度跑迴圈，將i++放入if中做為判斷
			int tmp = (int) ((Math.random() * numberRange) + 1);// 亂數產生由數字範圍內的任意值,由1開始			
			if (numberStatus[tmp] == false) {// 判斷陣列狀態是否已取用過,若等於false則是未取用的陣列				
				data[i] = tmp;// 將亂數產生的值,放入至data[i]
				int in = data[i];// 數字型態
				list.add(in);//放入List中
				Collections.sort(list);// 排序
				numberStatus[tmp] = true;// 將狀態改為true
				i++;//將迴圈+1進到下一個狀態
			}
		}//for End
		System.out.println();
		String b = new String();		
		for (Integer element : list) {
			String formatStr = "%02d";//將數字格式化,個位數補0
			String formatAns = String.format(formatStr, element);
			b = b + formatAns + ",";
		}
		b = b.substring(0, b.length() - 1);
		System.out.print("§ 號碼: " + b + "\t§");
		System.out.println();
		
	}

}
