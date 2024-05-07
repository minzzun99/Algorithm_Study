package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[7];
        int sum = 0;
        int min = 100;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] % 2 == 1) {
                sum += arr[i];
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
        }
        if(sum == 0) {
            sum = -1;
            System.out.println(sum);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
