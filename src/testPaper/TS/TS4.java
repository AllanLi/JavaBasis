package testPaper.TS;
/*	4.
 * 	ANS:235
 */
class TS4 {
	public static void main(String[] args) {
		int[] a1[] = {new int[]{1,2},new int[]{3,4,5}};
		int []a2[] = new int[][]{{1,2},{3,4,5}};
		int a3[][] = {{1,2},new int[]{3,4,5}};
		System.out.print(a1[0][1]+","+a2[1][0]+","+a3[1][2]);
	}
}
