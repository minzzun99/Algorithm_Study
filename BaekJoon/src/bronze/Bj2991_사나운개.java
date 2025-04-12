package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2991_사나운개 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 3; i++) {
            int N = Integer.parseInt(st.nextToken());
            int first = N % (A + B);
            int second = N % (C + D);
            int count = 0;

            if(first <= A && second <= C) {
                count = 2;
            }else if(first <= A || second <= C) {
                count = 1;
            }

            if(first == 0) {
                count -= 1;
            }
            if(second == 0) {
                count -= 1;
            }

            System.out.println(count);
        }
    }
}
