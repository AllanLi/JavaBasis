package basis.I;

public class KeyInput {
	public static void main( String argv[])throws Exception{
		//鍵盤輸入
		java.io.BufferedReader act = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println( act.readLine() );
	}
}
