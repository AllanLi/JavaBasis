package game.txt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class	Character{
	String name;
	int LV;
	int Exp;
	int HP;
	int MP;
	
	public void punch(){}
	public void setExp(){}
	// 人物初始化
	public void setCharacterInfo(String name){
		this.name = name;
		LV = 1;
		Exp = 0;
		HP = 100;
		MP = 30;		
	}
	// 顯示目前人物資訊
	public void getCharacterInfo(){
		System.out.println("角色名稱：" + name);
		System.out.println("人物等級：" + LV);
		System.out.println("角色血量：" + HP);
		System.out.println("角色魔力：" + MP);
		System.out.println("角色經驗：" + Exp);
	}
}


public class GameStart {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("歡迎來到 JAVA 文字遊戲");
		System.out.println("首先請輸入角色名稱");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String brStr = br.readLine();
		
		Character chaObj = new Character();
		chaObj.setCharacterInfo(brStr);
		chaObj.getCharacterInfo();
	}

}
