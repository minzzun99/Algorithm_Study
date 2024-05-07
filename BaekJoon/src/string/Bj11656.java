package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Bj11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Set<String> set = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.substring(i, str.length()));
        }
        set.stream().forEach(System.out::println);
    }
}
