/*
 * 收錄第一版(2015/03/17)
 * 猜數字文字版！GuessNumber
 * 這是文字版的猜數字遊戲，有分以下幾種玩法模式。
 * 1.電腦出題使用者猜
 * 2.使用者出題電腦猜
 * 3.電腦互猜(教學及測試用)
 * 4.電腦助猜
 * 5.人機大戰
 */
package org.magiclen.guessnumber; //猜數字套件

import java.util.Scanner; //讀取工具

/**
 * 含有程式進入點main()的主要類別(Main Class)
 *
 * @see StringClass
 * @author 幻嵐
 */
public class GuessNumber {

    /**
     * 程式進入點
     *
     * @param args 若有輸入一筆字串資料就直接拿來作為使用者名稱
     * @see Menu_Method
     */
    public static void main(String[] args) {
	welcomeMessage();  //顯示歡迎訊息

	/*
	 * 判斷是否有輸入args，若有則跳過讓使用者輸入名稱的步驟，直接作為使用者名稱
	 */
	if (args.length == 1) { //若args有一筆資料
	    StringClass.userName = args[0];
	} else {
	    setUserName();
	}
	System.out.printf(StringClass.SHOW_USER_WELCOME, StringClass.userName);

	/*
	 * 顯示清單。程式進入點結束任務了
	 */
	Menu.show();
    }

    /**
     * 設定使用者名稱。(若args沒有輸入則不會被執行)
     */
    private static void setUserName() {
	Scanner sc = new Scanner(System.in);

	System.out.print(StringClass.SHOW_TYPE_USER_NAME);
	String userName = sc.nextLine();
	while (userName.equals("") || userName.charAt(0) == ' ') { //如果沒有輸入
	    System.out.print(StringClass.SHOW_TYPE_USER_NAME_ERROR);
	    userName = sc.nextLine();
	}
	StringClass.userName = userName;
    }

    /**
     * 顯示歡迎訊息
     */
    private static void welcomeMessage() {
	System.out.print(StringClass.SHOW_WELCOME);
    }
}
