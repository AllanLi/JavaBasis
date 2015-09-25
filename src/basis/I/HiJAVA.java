package basis.I;

import java.util.Scanner;

public class HiJAVA {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		String hi = "hello, ";
		while (sc.hasNext()) {
			s = sc.nextLine();
			System.out.println(hi + s);
		}

	}

}
