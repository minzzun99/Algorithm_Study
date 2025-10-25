package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj14909_양수개수세기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long count = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .filter(num -> num > 0)
                .count();

        System.out.println(count);
    }
}
