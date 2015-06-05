package basis.II;
/*
 * 去除 Array 重複的值
 * 利用 Set 中項目或值不會重複的特性
 */

import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

public class ArrayRemoveDuplicateDemo {

    public static void main(String[] args) throws ParseException {

        // 建立有重複項目之 int array
        int duplicateArray[] = { 4, 2, 5, 1, 5, 2, 4, 3 };
        
        // 利用 Set 的特性，將所有項目放入 Set 中即可移除重複的項目
        Set<Integer> intSet = new HashSet<Integer>();
        for (int element : duplicateArray) {
        	System.out.print(LineNumber.getLineNumber()+ ": ");
            System.out.println("element: " + element);
            intSet.add(element);
        }

        // intSet.size() 為不重複項目的個數
        int nonDuplicateArray[] = new int[intSet.size()];
        
        // 將 Set 中的項目取出放到 nonDuplicateArray 中
        // 這裡也可以利用 iterator 來達成
        Object[] tempArray = intSet.toArray();
        System.out.println(intSet);
        for (int i = 0; i < tempArray.length; i++) {
            nonDuplicateArray[i] = (Integer) tempArray[i];
            System.out.println("nonDuplicateArray: " + nonDuplicateArray[i]);
        }

        // 輸出結果：1, 2, 3, 4, 5, 
        for (int element : nonDuplicateArray) {
            System.out.print(element + ", ");
        }
    }
}
