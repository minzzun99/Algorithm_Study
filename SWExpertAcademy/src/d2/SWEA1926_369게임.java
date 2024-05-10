package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1926_369게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);
            if (str.contains("3") || str.contains("6") || str.contains("9")) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9') {
                        System.out.print("-");
                    }
                }
                System.out.print(" ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
