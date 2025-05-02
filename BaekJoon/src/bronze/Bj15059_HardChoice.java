package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj15059_HardChoice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cA = Integer.parseInt(st.nextToken());
        int bA = Integer.parseInt(st.nextToken());
        int pA = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int cR = Integer.parseInt(st.nextToken());
        int bR = Integer.parseInt(st.nextToken());
        int pR = Integer.parseInt(st.nextToken());

        int sum = getCount(cA, cR) + getCount(bA, bR) + getCount(pA, pR);
        System.out.println(sum);
    }

    private static int getCount(int A, int R) {
        if (A >= R) {
            return 0;
        } else {
            return R - A;
        }
    }
}
