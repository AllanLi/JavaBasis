package com.TryCatchFamily;
/*
 *	try{}catch(){}	catch錯誤捕捉
 *	try{}finally{}	不管是否有例外皆執行finally區塊
 *	try{}catch(){}finally{}	先進行catch錯誤捕捉且不管是否有例外也要執行finally區塊
 */

class TryCatchFinallySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 數值除以 0 為致命性錯誤，所以以 try-catch 的例外處理作為捕捉錯誤
		 * System.out.println(1/0); 
		 */		
		try{
			System.out.println("let's go");
			System.out.println(1/0);
			System.out.println(1/1);
			System.out.println("why? What happened!");
		}catch (ArithmeticException ex) {
			/*
			 * 寫在 Exception 之前可進行錯誤的分類，本例便為算數類型的錯誤
			 */
            System.out.println("算術錯誤的例外");
        }catch(Exception ex){
			System.out.println("something wrong");		
		}finally{
			/*
			 * try-catch 複合陳述中，有些 catch 會被執行，有時 catch 則不會，
			 * 如果例外處理時有無論如何一定要執行的部份，這時可加進另一個關鍵字 finally ，將一定要執行的部份放到這裡
			 */
			System.out.println("無論發生啥事不管［正確］或［錯誤］都會進行的區塊。");
		}

	}

}
