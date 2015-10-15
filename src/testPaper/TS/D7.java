package testPaper.TS;
/*	7.
 * 	ANS:ABC
 */

class A7{}
class B7 extends A7 {}
class C7 extends B7 {}
class D7 {
	void m1(A7 a){System.out.print("A");}
	void m1(B7 b){System.out.print("B");}
	void m1(C7 c){System.out.print("C");}
	public static void main(String[] args) {
		A7 c1 = new C7();B7 c2 = new C7();
		C7 c3 = new C7();D7 d1 = new D7();
		d1.m1(c1);		d1.m1(c2);		d1.m1(c3);
	}
}
