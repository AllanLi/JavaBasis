package testPaper.TS;
/*	10.
 *	ANS:foobarfoobarfoo
 */
public class Base10 {
	public static final String FOO="foo";
	public static void main(String[] args) {
		Base10 b = new Base10();
		Sub s = new Sub();
		System.out.print(Base10.FOO);
		System.out.print(Sub.FOO);
		System.out.print(b.FOO);
		System.out.print(s.FOO);
		System.out.print(((Base10)s).FOO);
	}
}

class Sub extends Base10{public static final String FOO = "bar";}
