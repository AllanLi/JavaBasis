package testPaper.MiTAC;
/*
 * 答案要求印出 "red/green/orange"
 */
public class StringBufferForIf {
	public static void main(String[] args) {
		String[] colors = {"blue","red","green","yellow","orange"};
		String a = "";
//TEST start 
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<colors.length;i++){
			if(i==1 || i==2 || i==4){
				sb.append(colors[i]);
				sb.append("/");
			}
		}
		a = sb.toString();
//TEST End
		System.out.print(a);
	}
}
