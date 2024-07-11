package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj30089_새로운문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String str = br.readLine();
            for (int i = 0; i < str.length(); i++) {
                String checkString = str.substring(i);
                if (checkpalindrome(checkString)) {
                    sb.append(str);
                    for (int j = i - 1; j >= 0; j--) {
                        sb.append(str.charAt(j));
                    }
                    sb.append('\n');
                    break;
                } else {
                    continue;
                }
            }
        }
        System.out.println(sb);
    }

    private static boolean checkpalindrome(String str) {
        StringBuilder check = new StringBuilder();
        String checkStr = check.append(str).reverse().toString();
        if (str.equals(checkStr)) {
            return true;
        } else {
            return false;
        }
    }
}
