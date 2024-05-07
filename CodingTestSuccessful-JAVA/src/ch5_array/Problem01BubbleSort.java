package ch5_array;

import java.util.Arrays;

public class Problem01BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        long start = System.currentTimeMillis();
        int[] bubble = bubbleSort(arr);
        long end = System.currentTimeMillis();
        //Bubble 정렬 코드 시간 측정
        System.out.println("버블정렬 : " + (end-start) / 1000.0 + "초");

        start = System.currentTimeMillis();
        int[] sort = doSort(arr);
        end = System.currentTimeMillis();
        //정렬 API 코드 시간 측정
        System.out.println("정렬 API : " + (end-start) / 1000.0 + "초");
        System.out.println(Arrays.equals(bubble, sort));
    }

    private static int[] bubbleSort(int[] org) {
        int[] arr = org.clone();
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] doSort(int[] org) {
        int[] arr = org.clone();
        Arrays.sort(arr);
        return arr;
    }
}
