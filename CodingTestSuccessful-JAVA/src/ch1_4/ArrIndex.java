package ch1_4;

import java.util.Arrays;

public class ArrIndex {
    public static void main(String[] args) {
        int[] myArray = {1, 4, 2, 5, 3};
        myArray[1] = 7;
        System.out.println(Arrays.toString(myArray));
        System.out.println(myArray[2]);
        myArray[4] = myArray[2];
        System.out.println(Arrays.toString(myArray));

    }
}
