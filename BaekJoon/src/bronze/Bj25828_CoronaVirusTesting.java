package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj25828_CoronaVirusTesting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int g = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int test1 = g * p;
        int test2 = g + (p * t);
        if (test1 < test2) {
            System.out.println(1);
        } else if (test1 > test2) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
