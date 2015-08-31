/*
 * 常用的方法
 */
package org.magiclen.guessnumber;

import java.util.Scanner;

/**
 * 常用的方法，獨立出一個類別來存放
 *
 * @author 幻嵐
 */
public class Tools {

    /**
     * 延遲
     *
     * @param time 輸入延遲時間(單位：毫秒)
     */
    public static void delay(int time) {
	try {
	    Thread.sleep(time); //延遲
	} catch (Exception e) {
	}
    }

    /**
     * 只能輸入Y或N，其餘免談，會要求重新輸入
     *
     * @return 輸入Y傳回true，輸入N傳回false
     * @see StringClass
     */
    public static boolean typeYorN() {
	Scanner sc = new Scanner(System.in);
	String inputEnd = sc.nextLine(); //儲存使用者輸入的資料
	while (inputEnd.length() != 1 || (inputEnd.toUpperCase().charAt(0) != 'Y' && inputEnd.toUpperCase().charAt(0) != 'N')) { //如果輸入有誤
	    System.out.print(StringClass.SHOW_EXIT_ERROR);
	    inputEnd = sc.nextLine();
	}
	return inputEnd.toUpperCase().charAt(0) == 'Y';
    }

    /**
     * 用亂數的方式隨機取得字串陣列的項目
     *
     * @param array 傳入字串陣列
     * @return 傳回隨機取得的字串項目
     */
    public static String getStringArrayRandom(String[] array) {
	return array[(int) (Math.random() * array.length)];
    }
}
