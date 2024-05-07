package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        while ((str = br.readLine()) != null) {
            int lower = 0;  //소문자 개수
            int upper = 0;   //대문자 개수
            int number = 0;  //숫자 개수
            int space = 0;  //공백 개수
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == ' ') space++;
                if (Character.isUpperCase(c)) upper++;
                if (Character.isLowerCase(c)) lower++;
                if (Character.isDigit(c)) number++;
            }
            sb.append(lower + " " + upper + " " + number + " " + space + "\n");
        }
        System.out.println(sb);
    }
}
