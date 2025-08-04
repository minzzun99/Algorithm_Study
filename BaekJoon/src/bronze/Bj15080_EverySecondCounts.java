package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj15080_EverySecondCounts {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input1 = br.readLine();
        String[] arr1 = input1.split(" : ");
        String input2 = br.readLine();
        String[] arr2 = input2.split(" : ");

        int result = 0;
        int total1 = Integer.parseInt(arr1[0]) * 3600 + Integer.parseInt(arr1[1]) * 60 + Integer.parseInt(arr1[2]);
        int total2 = Integer.parseInt(arr2[0]) * 3600 + Integer.parseInt(arr2[1]) * 60 + Integer.parseInt(arr2[2]);

        if(total1 <= total2) {
            result = total2 - total1;
        }else {
            result = 86400 - total1 + total2;
        }

        System.out.println(result);
    }
}
