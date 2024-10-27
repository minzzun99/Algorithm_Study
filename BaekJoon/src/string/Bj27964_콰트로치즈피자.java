package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Bj27964_콰트로치즈피자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> cheeseSet = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            String input = st.nextToken();
            if (input.endsWith("Cheese")) {
                cheeseSet.add(input);
            }
        }

        if (cheeseSet.size() >= 4) {
            System.out.println("yummy");
        }else {
            System.out.println("sad");
        }
    }
}
