package test.lottery;

/**
 * 所有字串集合
 * 
 * @author Allan
 *
 */
public class LotteryStringClass {
	public static String userName = "使用者";
	public static final String SHOW_WELCOME = "\n\t 歡迎使用此程式 \n\n";
	public static final String SHOW_USER_WELCOME = "%s 您好！\n"; // printf
	public static final String SHOW_TYPE_USER_NAME_ERROR = "未輸入大名，請重新輸入";
	public static final String SHOW_TYPE_USER_NAME = "請輸入大名：";
	public static final String SHOW_MENU_TOP = "********** 主選單 **********";// 選單開頭
	public static final String SHOW_MENU_ITEMS[] = { "大樂透", "今彩 539",
			"大福彩", "自動模式 --- 暫無功能"+"&"+"玩法說明 --- 暫無功能", "離開選單" };// 主選單項目
	public static final String SHOW_MENU_TYPE = "\t%d.%s\n"; // printf,為轉換字符,%d為十進位整數,%s為字串
	public static final String SHOW_MENU_END = "********** 請選擇 **********\n";// 選單結尾
	public static final String SHOW_TYPE_MENU_ITEM = "請輸入您要的功能[1-"
			+ SHOW_MENU_ITEMS.length + "]：";
	public static final String SHOW_TYPE_MENU_ITEM_ERROR = "輸入有誤，請重新輸入[1-"
			+ SHOW_MENU_ITEMS.length + "]：";
	public static final String SHOW_GAME_BIG_LOTTERY 	= "********** 大樂透 **********";// 遊戲名稱_大樂透
	public static final String SHOW_GAME_WONDERFUL_539 	= "********* 今彩 539 *********";// 遊戲名稱_今彩539
	public static final String SHOW_GAME_BIG_BLISS 		= "********** 大福彩 **********";// 遊戲名稱_今彩539
	public static final String SHOW_EXIT_MENU = "離開選單等於關閉程式，您確定嗎？[Y/N]：";
	public static final String SHOW_EXIT = "Goodbye! %s \n"; // printf,為轉換字符,%s為字串
	public static final String SHOW_WELCOME_BACK = "WELCOME BACK！";

}
