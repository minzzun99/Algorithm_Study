package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj3047_ABC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);

        String input = br.readLine();
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if (c == 'A') {
                sb.append(list.get(0)).append(' ');
            } else if (c == 'B') {
                sb.append(list.get(1)).append(' ');
            } else {
                sb.append(list.get(2)).append(' ');
            }
        }

        System.out.println(sb);
    }
}
