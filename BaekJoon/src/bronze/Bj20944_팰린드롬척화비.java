package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bj20944_팰린드롬척화비 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String result = Stream.generate(() -> "a")
                .limit(N)
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
