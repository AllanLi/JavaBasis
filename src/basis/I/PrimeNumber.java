package basis.I;
/*
 * 計算 1~100的質數
 * 條件為：可以被 1和 自己 所整除
 */
public class PrimeNumber {
	public static void main(String[] args){
		int var; 
		int counter = 0;
		// 從 1至100的 i數
		for(int i=1;i<=100;i++){
//			System.out.print("i= "+i+"\t");
			
			//j數值 從1 開始 計算至 i數最大限值 
			for(int j=1;j<=i;j++){
				
				// 計算 i數被 j數 所整除的餘數 				
				var = i%j;
//				System.out.print("i="+i+",j="+j+",var="+var+",\t");
				
				// 若 i數可被j數整除時，counter 由 0+1至無限
				if(var == 0){
					counter ++;
//					System.out.print("var= ["+var+"]\t");
//					System.out.print("counter= "+counter+"\t");
//					System.out.print("j= "+j+"\t");
				}
			}
			//若前一層迴圈的counter累加至多等於2時,表示 至多被 1整除或是被自己整除,無其他的整除時~數值至多為2
			if(counter == 2){
				System.out.println("ANS:"+i);
			}
			
			// 每次計算完畢,須將 counter 歸零
			counter = 0;			
		}
	}
}
