package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj15820_맞았는데왜틀리죠 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S1 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());

        for (int i = 0; i < S1; i++) {
            st = new StringTokenizer(br.readLine());
            int answer = Integer.parseInt(st.nextToken());
            int result = Integer.parseInt(st.nextToken());
            if (answer != result) {
                System.out.println("Wrong Answer");
                return;
            }
        }

        for (int i = 0; i < S2; i++) {
            st = new StringTokenizer(br.readLine());
            int answer = Integer.parseInt(st.nextToken());
            int result = Integer.parseInt(st.nextToken());
            if (answer != result) {
                System.out.println("Why Wrong!!!");
                return;
            }
        }

        System.out.println("Accepted");
    }
}
