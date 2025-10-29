package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj17263_Sort마스터배지훈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .max()
                .orElse(0);
        System.out.println(max);
    }
}
