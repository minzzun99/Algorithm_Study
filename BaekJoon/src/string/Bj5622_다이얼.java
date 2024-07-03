package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5622_다이얼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int time = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < 68) {
                time += 3;
            } else if (c < 71) {
                time += 4;
            } else if (c < 74) {
                time +=5;
            } else if (c < 77) {
                time +=6;
            } else if (c < 80) {
                time +=7;
            } else if (c < 84) {
                time +=8;
            } else if (c < 87) {
                time += 9;
            } else {
                time += 10;
            }
        }
        System.out.println(time);
    }
}
