package ch13_sort;

import java.util.ArrayList;

public class Problem55 {
    public static String solution(int[] numbers) {
        ArrayList<String> list = new ArrayList<>();
        for (int i : numbers) {
            list.add(String.valueOf(i));
        }
        list.sort((o1,o2) -> {
            int a = Integer.parseInt(o1 + o2);
            int b = Integer.parseInt(o2 + o1);
            return Integer.compare(b, a);
        });

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }

        return sb.charAt(0) == '0' ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {4, 30, 3};
        System.out.println(solution(numbers));
    }
}
