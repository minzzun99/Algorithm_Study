package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj32498_CallForProblems {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(br.readLine()) % 2 == 0) {
                continue;
            }
            count++;
        }

        System.out.println(count);
    }
}
