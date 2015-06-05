package basis.I;
/*
 * 列出 JAVA & 系統環境 參數
 */

import java.util.Properties;

public class JavaSystem {
	public static void main (String[] args){
		// this will list the current system properties
		// 列出當前系統屬性
		Properties p = System.getProperties();
		p.list(System.out);
	}
}
