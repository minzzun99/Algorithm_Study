package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1475_방번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNumber = br.readLine();

        int[] number = new int[9];

        for (int i = 0; i < roomNumber.length(); i++) {
            int num = roomNumber.charAt(i) - '0';

            if (num == 9 || num == 6) {
                number[6]++;
            } else {
                number[num]++;
            }
        }

        number[6] = (number[6] + 1) / 2;

        int max = 0;
        for (int i = 0; i < 9; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }

        System.out.println(max);
    }
}
