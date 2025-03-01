package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj14656_조교는새디스트야 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if(i != Integer.parseInt(st.nextToken())) {
                count++;
            }
        }
        System.out.println(count);
    }
}
