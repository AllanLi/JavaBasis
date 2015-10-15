package testPaper.TS;
/*	6.
 * 	ANS:8,4
 */

class TS6 {
	public static void main(String[] args) {
		int i = 0, j = 9;
		do {
			//System.out.println("do "+"i:"+i+",j:"+j);//allan
			if (j < 4) {
				//System.out.println("if "+"i:"+i+",j:"+j);//allan
				break;
			} else if (j-- < 7) {
				//System.out.println("else if "+"i:"+i+",j:"+j);//allan
				continue;
			}
			i++;
		} while (i++ < 7);
		System.out.print(i + "," + j);
	}
}
