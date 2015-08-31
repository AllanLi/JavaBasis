/*
 * 程式功能選單
 */
package org.magiclen.guessnumber;

import java.util.Scanner;

/**
 * 清單
 *
 * @see StringClass
 * @see Menu_Method
 * @author 幻嵐
 */
public class Menu {

    /**
     * 顯示選單
     */
    public static void show() {
	System.out.print(StringClass.SHOW_MENU_TOP);
	for (int i = 0; i < StringClass.SHOW_MENU_ITEMS.length; i++) {
	    System.out.printf(StringClass.SHOW_MENU_TYPE, i + 1, StringClass.SHOW_MENU_ITEMS[i]);
	}
	System.out.print(StringClass.SHOW_MENU_END);
	typeData(); //由使用者輸入資料
    }

    /**
     * 由使用者輸入資料(清單上面的號碼)
     */
    private static void typeData() {
	Scanner sc = new Scanner(System.in);
	System.out.print(StringClass.SHOW_TYPE_MENU_ITEM);
	String inputString = sc.nextLine(); //儲存使用者輸入的資料
	while (inputString.length() != 1 || inputString.charAt(0) < '1' || inputString.charAt(0) > StringClass.SHOW_MENU_ITEMS.length + 48) { //如果輸入有誤
	    System.out.print(StringClass.SHOW_TYPE_MENU_ITEM_ERROR);
	    inputString = sc.nextLine();
	}
	Menu_Method.methods(inputString.charAt(0) - 48); //呼叫Menu選單的方法，傳入引數為選單的選項值
    }
}
