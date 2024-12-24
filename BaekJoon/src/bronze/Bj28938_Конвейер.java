package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj28938_Конвейер {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(st.nextToken());
        }

        if (sum < 0) {
            System.out.println("Left");
        } else if (sum == 0) {
            System.out.println("Stay");
        } else {
            System.out.println("Right");
        }
    }
}
