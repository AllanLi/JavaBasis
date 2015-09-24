package testCase.me;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 產生樂透號碼
 */
public class Lottery {

	public static void main(String[] args) throws IOException {
		// 指定數字範圍，不可小於指定數字數量
		int rn = 6;
		// 指定數字數量
		int nn = 5;
		// 亂數
		// Random r = new Random();

		// 產生數字範圍的陣列,型態為 boolean,預設為 false
		boolean[] status = new boolean[rn + 1];
		// 產生數字數量陣列
		int[] data = new int[nn];

		List<String> list = new ArrayList<>();// 創建一個 List
		List<Integer> list2 = new ArrayList<>();// 創建一個 List

		// 依據data的長度跑迴圈，將i++放入if中做為判斷
		for (int i = 0; i < data.length;) {
			// 亂數取出陣列值
			// int tmp = r.nextInt(6);
			int tmp = (int) ((Math.random() * rn) + 1);// 亂數產生由數字範圍內的任意值,由1開始

			// 依據亂數所取出的值判斷狀態，如果判斷為false 則不執行，再跑一run,//錯誤描述TMD
			// 判斷陣列狀態是否已取用過,若等於false則是未取用的陣列
			if (status[tmp] == false) {
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
				status[tmp] = true;
				// 將迴圈+1進到下一個狀態
				i++;
			}
		}

		// 比對用資料~
		int n = 5;
		for (int i = 0; i < n; i++) {
			System.out.print("[" + i + "]=");
			System.out.print(data[i]);
			if (i < n - 1) {
				System.out.print(",");
			}
		}
		System.out.println();

		System.out.println("list for each ");// list for each 秀
		String a = new String();
		for (String element : list) {
			// if(element.equals(list.get(list.size()-1)))//-1為陣列由0開始,因此5-1
			// a=a+element;
			// else
			a = a + element + ",";
		}
		a = a.substring(0, a.length() - 1);
		System.out.print("字串型態a: " + a);

		System.out.println();
		String b = new String();		
		for (Integer element : list2) {
			String formatStr = "%02d";
			String formatAns = String.format(formatStr, element);
			b = b + formatAns + ",";
		}
		b = b.substring(0, b.length() - 1);
		System.out.print("整數型態b: " + b);

		// 讀取資料夾內檔案
		System.out.println();
		System.out.println("讀取資料夾內檔案");
		String filePath = "D:\\AllanGit\\FileS"; // 資料夾路徑
		File fileP = new File(filePath);
		ArrayList<String> fileList = new ArrayList<>();
		if (fileP.isDirectory()) { // 判斷是否為資料夾
			System.out.println("檔案資料夾名稱: " + fileP.getName()); // 讀取資料夾名稱
			String[] s = fileP.list();// 建一個list
			System.out.println("資料夾內檔案數: " + s.length);// 印出資料夾內檔案個數
			for (int i = 0; i < s.length; i++) {
				fileList.add(s[i]);// 將檔案名稱加入list 中
			}
		}
		for (int i = 0; i < fileList.size(); i++) {
			System.out.println("檔案名稱: "+fileList.get(i));// 印出資料夾內檔案名稱
			String filePS = fileP + "\\" + fileList.get(i);// 檔案路徑
			FileReader fr = new FileReader(filePS);// 讀取檔案
			BufferedReader br = new BufferedReader(fr);// 暫存檔案內容
			while (br.ready()) {
				//System.out.println(br.readLine());// 印出檔案內容
				
				String rl = br.readLine();
				if(b.equals(rl)){
					System.out.print("重複: ");
					System.out.println(rl);// 印出檔案內容
				}else{
					System.out.print("不重複: ");
					System.out.println(rl);// 印出檔案內容
				}
			}
			fr.close();
		}
		
		//比對
		

	}
}
