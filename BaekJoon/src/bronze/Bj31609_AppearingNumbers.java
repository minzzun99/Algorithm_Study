package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Bj31609_AppearingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Arrays.stream(br.readLine()
                .split(" "))
                .distinct()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
