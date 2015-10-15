package testPaper.TS;
/*	2.
 * 	ANS:1,2
 */
class TS2 {
	static int m1(int x){return ++x;}
	public static void main(String[] args) {
		int x = 1;
		int y = m1(x);
		System.out.println(x+","+y);
	}

}
