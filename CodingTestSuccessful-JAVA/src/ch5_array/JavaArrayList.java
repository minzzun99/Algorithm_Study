package ch5_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(list);
        System.out.println(list2);

        System.out.println(list.get(1));    //인덱스로 접근

        list.remove(1);
        System.out.println(list);
        list2.remove(list2.size()-2);   // 리스트 크기의 -1번째 인덱스 삭제  list2의 사이즈는 3 - 2
        System.out.println(list2);
        System.out.println("--------");

        int[] arr = {1, 3, 2, 5, 4};
        System.out.println(arr.length);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("--------");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,5,4));
        System.out.println(list3.size());
        System.out.println(list3.isEmpty());
        Collections.sort(list3);
        System.out.println(list3);
    }
}
