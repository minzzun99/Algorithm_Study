package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj6784_MultipleChoice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] student = new char[N];

        for (int i = 0; i < N; i++) {
            student[i] = br.readLine().charAt(0);
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if(br.readLine().charAt(0) == student[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
