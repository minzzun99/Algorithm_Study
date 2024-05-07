package ch5_array;

import java.util.TreeSet;

public class Problem03 {
    public static int[] solution(int[] arr) {
        /*ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                arrayList.add(sum);
            }
        }
        return arrayList.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();*/

        /*HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                set.add(sum);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();*/

        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                set.add(sum);
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
