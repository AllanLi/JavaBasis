package basis.Math;
/*
 *	Math 類別有 static abs() 方法(method)，回傳參數(parameter)的絕對值
 *	====================
 *	回傳parameter的絕對值
 *	====================
 *	double abs(double d)
 *	float abs(float f)
 *	int abs(int i)
 *	long abs(long lng) 
 */
class Method_abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 =-23;
		long a2=-96;
		float a3 =-63.25f;
		double a4 =-9.07;
		System.out.println(a1+"	<=> "+Math.abs(a1));
		System.out.println(a2+"	<=> "+Math.abs(a2));
		System.out.println(a3+"	<=> "+Math.abs(a3));
		System.out.println(a4+"	<=> "+Math.abs(a4));
	}

}
