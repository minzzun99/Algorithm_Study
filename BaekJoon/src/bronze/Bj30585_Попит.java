package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj30585_Попит {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        char[][] arr = new char[h][w];
        for (int i = 0; i < h; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        int countA = 0;
        int countB = 0;
        for (int i = 0; i < h; i++) {
            for (char c : arr[i]) {
                if (c == '0') {
                    countA++;
                    continue;
                }
                countB++;
            }
        }

        System.out.println(Math.min(countA, countB));
    }
}
