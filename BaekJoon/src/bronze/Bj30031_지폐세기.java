package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj30031_지폐세기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int sum = 0;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());

            if(M == 136){
                sum += 1000;
            } else if (M == 142) {
                sum += 5000;
            } else if (M == 148) {
                sum += 10000;
            } else if (M == 154)   {
                sum += 50000;
            }
        }

        System.out.println(sum);
    }
}
