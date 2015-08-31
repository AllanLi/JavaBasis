/*
 * 使用者玩家
 */
package org.magiclen.guessnumber;

import java.util.Scanner;

/**
 * 使用者玩家。繼承Player。
 *
 * @see Player
 * @see StringClass
 * @see Talk
 * @see Tools
 * @author 幻嵐
 */
public class UserPlayer extends Player {
    //-------------------------變數-------------------------

    private final Scanner sc = new Scanner(System.in);

    //-------------------------建構式-------------------------
    /**
     * 建構子(有多載)。傳入使用者玩家的名稱。
     *
     * @param inputName 傳入使用者玩家的名稱
     */
    public UserPlayer(String inputName) {
	setName(inputName); //設定名稱
	setGuessTimes(0); //已猜次數歸零
    }

    /**
     * 建構子(有多載)。沒有參數為電腦助猜模式
     */
    public UserPlayer() { //建構子，無參數
	setName(StringClass.userName); //設定名稱
	setGuessTimes(-999); //設定已猜次數為負數
    }

    //-------------------------實作抽象-------------------------
    /**
     * 輸出語句
     *
     * @param sentence 傳入Talk特徵
     */
    @Override
    public void talk(Talk sentence) { //輸出語句
	switch (sentence) {
	    case START:
		if (getGuessTimes() >= 0) {
		    System.out.printf(StringClass.SHOW_TALK_NAME_SENTENCE, getName(), Tools.getStringArrayRandom(StringClass.USER_ASKER_APPEAR));
		} else {
		    System.out.printf(StringClass.SHOW_TALK_NAME_SENTENCE, getName(), Tools.getStringArrayRandom(StringClass.USER_SERVICE));
		}
		break;
	    case FINISH:
		if (getGuessTimes() >= 0) {
		    System.out.print(StringClass.SHOW_MAKE_QUESTION);
		} else {
		    System.out.print(StringClass.SHOW_SERVICE_HELP);
		}
		sc.nextLine();
		break;
	    case GUESS:
		if (getGuessTimes() >= 0) {
		    System.out.printf(StringClass.SHOW_TALK_NAME_SENTENCE, getName(), Tools.getStringArrayRandom(StringClass.START_GUESS));
		}
		break;
	    case BYE:
		System.out.printf(StringClass.SHOW_TALK_NAME_SENTENCE, getName(), Tools.getStringArrayRandom(StringClass.USER_BYE));
		break;
	}
    }

    /**
     * 回答提示。用getLastHint()方法來取得結果。
     *
     * @param respondent 傳入提示對象(出題者要提示猜題者)
     */
    @Override
    public void replyHint(Player respondent) {
	System.out.printf(StringClass.SHOW_TALK_NAME, getName());
	String typeHint = sc.nextLine();
	while (checkHint(typeHint) == false) { //如果輸入有誤
	    System.out.printf(StringClass.SHOW_TALK_NAME_SENTENCE, respondent.getName(), Tools.getStringArrayRandom(StringClass.COMPUTER_HINT_TYPE_ERROR));
	    System.out.printf(StringClass.SHOW_TALK_NAME, getName());
	    typeHint = sc.nextLine();
	}
	setLastHint(typeHint);
    }

    /**
     * 回答問題。用getLastGuess()方法來取得結果。
     *
     * @param asker 傳入回答對象(猜題者要猜出題者的數字)
     */
    @Override
    public void respondQuestion(Player asker) {
	System.out.printf(StringClass.SHOW_TALK_NAME, getName());
	String inputNumber = sc.nextLine();
	while (checkAnswer(inputNumber) == false) { //如果輸入有誤
	    System.out.printf(StringClass.SHOW_TALK_NAME_SENTENCE, asker.getName(), Tools.getStringArrayRandom(StringClass.COMPUTER_HINT_TYPE_ERROR));
	    System.out.printf(StringClass.SHOW_TALK_NAME, getName());
	    inputNumber = sc.nextLine();
	}
	setGuessTimes(getGuessTimes() + 1); //已猜次數加一
	setLastGuess(inputNumber);
    }

    /**
     * 思考提示。USER沒必要。
     *
     * @param inputHint 接收提示
     */
    @Override
    public void thinkHint(String inputHint) {
	//無動作
    }

    /**
     * 傳回猜中機率。USER無效。
     *
     * @return 傳回猜中機率
     */
    @Override
    public double getGuessPercent() {
	return -1; //無法計算猜中機率
    }
}
