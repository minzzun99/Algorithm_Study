package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj11549_Identifying_tea {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (T == Integer.parseInt(st.nextToken())) {
                count++;
            }
        }
        System.out.println(count);
    }
}
