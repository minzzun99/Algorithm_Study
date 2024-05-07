package ch13_sort;

import java.util.Arrays;

public class Problem54 {
    public static int[] solution(int[] array, int[][] commands) {
        int n = commands.length;
        int[] result = new int[n];

        for (int x = 0; x < n; x++) {
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];

            int[] arr = new int[j - i + 1];
            int index = 0;
            for (int a = i - 1; a < j; a++) {
                arr[index] = array[a];
                index++;
            }
            Arrays.sort(arr);
            result[x] = arr[k - 1];
        }
        return result;
    }
/*
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = solution(arr, commands);
        for (int i : result) {
            System.out.println(i);
        }
    }*/
}
