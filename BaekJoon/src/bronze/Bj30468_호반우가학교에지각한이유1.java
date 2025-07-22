package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj30468_호반우가학교에지각한이유1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int STR = Integer.parseInt(st.nextToken());
        int DEX = Integer.parseInt(st.nextToken());
        int INT = Integer.parseInt(st.nextToken());
        int LUK = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int sum = STR + DEX + INT + LUK;
        int result = N * 4 - sum;
        if (result <= 0) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }
    }
}
