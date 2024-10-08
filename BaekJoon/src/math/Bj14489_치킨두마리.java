package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj14489_치킨두마리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int chickenPrice = Integer.parseInt(br.readLine()) * 2;
        if (A + B < chickenPrice) {
            System.out.println(A + B);
        } else {
            System.out.println((A + B) - chickenPrice);
        }
    }
}
