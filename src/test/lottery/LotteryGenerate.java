package test.lottery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LotteryGenerate {

	public static void numberRandom(int numberRange, int numberAmount) {
		System.out.print(LotteryStringClass.SHOW_GAME_BIG_LOTTERY);
		boolean[] numberStatus = new boolean[numberRange +1];
		int[] data = new int[numberAmount];
		
		List<String> list = new ArrayList<>();// 創建一個 List
		List<Integer> list2 = new ArrayList<>();// 創建一個 List

		// 依據data的長度跑迴圈，將i++放入if中做為判斷
		for (int i = 0; i < data.length;) {
			// 亂數取出陣列值
			// int tmp = r.nextInt(6);
			int tmp = (int) ((Math.random() * numberRange) + 1);// 亂數產生由數字範圍內的任意值,由1開始

			// 依據亂數所取出的值判斷狀態，如果判斷為false 則不執行，再跑一run,//錯誤描述TMD
			// 判斷陣列狀態是否已取用過,若等於false則是未取用的陣列
			if (numberStatus[tmp] == false) {
				// 將亂數產生的值,放入至data[i]
				data[i] = tmp;

				// 字串型態
				String str = String.valueOf(data[i]); // 轉型
				list.add(str); // 用 List 接
				Collections.sort(list);// 排序

				// 數字型態
				int in = data[i];
				list2.add(in);
				Collections.sort(list2);// 排序

				// 將狀態改為true
				numberStatus[tmp] = true;
				// 將迴圈+1進到下一個狀態
				i++;
			}
		}//for End
		System.out.println();
		String b = new String();		
		for (Integer element : list2) {
			String formatStr = "%02d";
			String formatAns = String.format(formatStr, element);
			b = b + formatAns + ",";
		}
		b = b.substring(0, b.length() - 1);
		System.out.print("§ 號碼: " + b + "\t§");
		System.out.println();
		
	}

}
