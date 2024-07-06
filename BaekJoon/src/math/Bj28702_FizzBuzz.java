package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj28702_FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[3];
        int max = 0;
        int idx = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = br.readLine();
            if (arr[i].chars().allMatch(Character::isDigit)) {
                idx = i;
                max = Integer.parseInt(arr[i]);
            }
        }
        int num;
        if (idx == 2) {
            num = max + 1;
        } else if (idx == 1) {
            num = max + 2;
        } else {
            num = max + 3;
        }

        if ((num % 3 == 0) && (num % 5 == 0)) {
            System.out.println("FizzBuzz");
        } else if ((num % 3 == 0) && (num % 5 != 0)) {
            System.out.println("Fizz");
        } else if ((num % 3 != 0) && (num % 5 == 0)) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}
