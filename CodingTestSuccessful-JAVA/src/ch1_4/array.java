package ch1_4;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = new int[] {1, 3, 5, 7, 9};
        int[] arr3 = new int[5];
        arr3[0] = 0;
        arr3[1] = 2;
        arr3[2] = 4;
        arr3[3] = 6;
        arr3[4] = 8;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
