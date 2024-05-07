package ch1_4;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);

        System.out.println(list.get(2));        //인덱스로 값 접근, 4
        System.out.println(list);
    }
}
