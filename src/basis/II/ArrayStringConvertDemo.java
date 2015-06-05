package basis.II;
/*
 * int Array 轉 Array string 
 * Array string 轉回 int Array
 */
import java.text.ParseException;
import java.util.Arrays;

public class ArrayStringConvertDemo {	
    public static void main(String[] args) throws ParseException {    	
        // 建立有重複項目之 int array
        int intArray[] = { 4, 2, 5, 1, 5, 2, 4, 3 };

        // 將 int array 轉換成 array string
        // 呼叫 intArrayToArrayString 執行轉換
        String arrayString = intArrayToArrayString(intArray);
        System.out.print(LineNumber.getLineNumber()+ ": ");
        System.out.println("intArrayToArrayString: " + arrayString);

        // 將剛剛產生之 array string 再轉為 int array
        // 呼叫 arrayStringToIntArray 執行轉換
        arrayStringToIntArray(arrayString);
        System.out.print(LineNumber.getLineNumber()+ ": ");
        System.out.println("arrayStringToIntArray: " + arrayString);
    }

    static String intArrayToArrayString(int[] array) {
        // 利用 Arrays.toString 可以超簡單輸出 array
        // 輸出結果：[4, 2, 5, 1, 5, 2, 4, 3]
        String arrayString = Arrays.toString(array);
        System.out.print(LineNumber.getLineNumber()+ ": ");
        System.out.println("arrayString: " + arrayString);
        
        return arrayString;
    }

    static void arrayStringToIntArray(String arrayString) {
        // 將剛剛輸出之 array string 先作去頭去尾處理
        // 並用 split 來分開各個項目
        String[] items = arrayString.replaceAll("\\[", "").replaceAll("\\]", "").split(",");
        
        // items.length 是所有項目的個數
        int[] results = new int[items.length];

        // 將結果放入 results，
        // 並利用 Integer.parseInt 來將整數字串轉換為 int
        for (int i = 0; i < items.length; i++) {
            results[i] = Integer.parseInt(items[i].trim());
        }

        // 此時已將字串轉換至 results 中，
        // 但為了檢查，我們還是要把 results 印出來。
        // 輸出結果：4, 2, 5, 1, 5, 2, 4, 3, 
        for (int element : results) {
        	System.out.print(LineNumber.getLineNumber()+ ": ");
            System.out.print(element + ", ");
        }
        System.out.println();
    }
}
