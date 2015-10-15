package testPaper.TS;
/*	3.
 * 	ANS:compilation m3() 
 */
class A3{
	public void m1(){System.out.println("A.m1,");}
	protected void m2(){System.out.println("A.m2,");}
	private void m3(){System.out.println("A.m3,");}
	void m4(){System.out.println("A.m4,");}
}

class B3 {
	public static void main(String[] args) {
		A3 a = new A3();
		a.m1();	//1
		a.m2();	//2
		//a.m3();	//3
		a.m4();	//4

	}

}
