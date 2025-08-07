package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj21354_사과와배 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        if (A * 7 > P * 13) {
            System.out.println("Axel");
        } else if (A * 7 < P * 13) {
            System.out.println("Petra");
        } else {
            System.out.println("lika");
        }
    }
}
