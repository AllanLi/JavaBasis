package testPaper.Bank.TS;
/*	9.
 * 	ANS:5,5
 */
public class TS9 {

	public static void main(String[] args) {
		int x = 0;
		int y = 10;
		do{
			++x;			
			y--;
			//System.out.println("x:"+x+","+"y:"+y);//allan
		}while(x < 5);
		System.out.print("ANS:");
		System.out.print(x+","+y);
	}
}
