package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bj12933_오리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        List<Character> duck = List.of('q', 'u', 'a', 'c', 'k');
        boolean[] visited = new boolean[input.length];
        int count = 0;

        if (input.length % 5 != 0 || input[0] != 'q') {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < input.length; i++) {
            if (visited[i]) {
                continue;
            }

            int index = 0;
            List<Character> list = new ArrayList<>();
            for (int j = i; j < input.length; j++) {
                if (!visited[j] && duck.get(index) == input[j]) {
                    visited[j] = true;
                    list.add(duck.get(index));
                    index = (index + 1) % 5;
                }
            }

            if (list.size() != 0 && list.size() % 5 == 0) {
                count++;
            } else {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(count);
    }
}
