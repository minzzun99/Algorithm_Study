package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj25641_균형잡힌소떡소떡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sCount = 0;
        int tCount = 0;
        for (int i = 0; i < N; i++) {
            if (str.charAt(i) == 's') {
                sCount++;
            } else {
                tCount++;
            }
        }

        for (int i = 0; i < N; i++) {
            if (sCount == tCount) {
                str = str.substring(i);
                break;
            }

            if (str.charAt(i) == 's') {
                sCount--;
            } else {
                tCount--;
            }
        }

        System.out.println(str);
    }
}
