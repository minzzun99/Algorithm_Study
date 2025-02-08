package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Bj28074_모비스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        if (set.contains('M') && set.contains('O') && set.contains('B') && set.contains('I') && set.contains('S')) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}