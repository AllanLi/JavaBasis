package basis.II;
/*
 * arraySort 順序排列 
 * TreeSet 同時將陣列作排序及移除重複項目
 */
import java.text.ParseException;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArraySortDemo {

    public static void main(String[] args) throws ParseException {

        // 建立有重複項目之 int array
        int intArray[] = { 4, 2, 5, 1, 5, 2, 4, 3 };

        // 利用 Arrays.sort 來排序
        // 輸出結果：[1, 2, 2, 3, 4, 4, 5, 5]
        arraySort(intArray);

        // 使用 TreeSet，同時達成排序和移除重複項目的需求。
        // 輸出結果：[1, 2, 3, 4, 5]
        treeSetSort(intArray);
    }

    static void arraySort(int[] array) {

        Arrays.sort(array);
        String arrayString = Arrays.toString(array);
        System.out.print(LineNumber.getLineNumber()+ ": ");
        System.out.println("arraySort: "+arrayString);
    }

    static void treeSetSort(int[] duplicateArray) {

        Set<Integer> intSet = new TreeSet<Integer>();
        for (int element : duplicateArray) {
            intSet.add(element);
        }

        int nonDuplicateAndSortedArray[] = new int[intSet.size()];

        Object[] tempArray = intSet.toArray();

        for (int i = 0; i < tempArray.length; i++) {
            nonDuplicateAndSortedArray[i] = (Integer) tempArray[i];
        }

        String arrayString = Arrays.toString(nonDuplicateAndSortedArray);
        System.out.print(LineNumber.getLineNumber()+ ": ");
        System.out.println("treeSetSort: "+arrayString);
    }
}
