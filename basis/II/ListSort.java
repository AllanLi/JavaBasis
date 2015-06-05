package basis.II;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSort {

    public static void main(String[] args) {

        List<StringIntPair> list = new ArrayList<StringIntPair>();

        list.add(new StringIntPair("ab", 5));
        list.add(new StringIntPair("ca", 3));
        list.add(new StringIntPair("aa", 2));
        list.add(new StringIntPair("db", 4));
        list.add(new StringIntPair("bc", 1));

        System.out.println("排序前");
        for (Object o:list) {
            System.out.println(o);
        }

        // 依string排序
        Collections.sort(list,
        new Comparator<StringIntPair>() {
            public int compare(StringIntPair o1, StringIntPair o2) {
                return o1.getString().compareTo(o2.getString());
            }
        });
        System.out.println();
        System.out.println("依string排序");
        for (Object o:list) {
            System.out.println(o);
        }

        // 依Integer排序
        Collections.sort(list,
        new Comparator<StringIntPair>() {
            public int compare(StringIntPair o1, StringIntPair o2) {
                return o2.getInteger()-o1.getInteger();
            }
        });
        System.out.println();
        System.out.println("依Integer排序");
        for (Object o:list) {
            System.out.println(o);
        }
    }
}