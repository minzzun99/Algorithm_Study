package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj15727_조별과제조장이사라졌다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N % 5 == 0) {
            System.out.println(N / 5);
        } else {
            System.out.println((N / 5) + 1);
        }
    }
}
