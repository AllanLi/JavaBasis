package basis.I;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInOutPut {

	public static void main(String[] args) throws IOException {
		//讀取檔案
		FileReader fr = new FileReader("D:\\AllanGit\\test.TXT");
		BufferedReader	br = new BufferedReader(fr);
		while(br.ready()){
			System.out.println(br.readLine());
		}
		fr.close();
		
		//寫入檔案
		FileWriter fw = new FileWriter("D:\\AllanGit\\test1.TXT");
		fw.write("寫入文字的區塊\n寫入文字的區塊\n寫入文字的區塊\n");
		fw.flush();
		fw.close();
	}

}
