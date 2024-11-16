package ssafy13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1213_String_2 {
    private static final String PRINT = "#%d %d%n";
    private static final int T = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][] arr;

        for (int tc = 1; tc <= T; tc++) {
            int tNum = Integer.parseInt(br.readLine());
            String find = br.readLine();
            String str = br.readLine();

            sb.append(String.format(PRINT, tNum, countSentence(find, str)));
        }

        System.out.println(sb);
    }

    private static int countSentence(String find, String str) {
        int count = 0;
        for (int i = 0; i < str.length() - find.length() + 1; i++) {
            String sub = str.substring(i, i + find.length());
            if (sub.equals(find)) {
                count++;
            }
        }

        return count;
    }
}
