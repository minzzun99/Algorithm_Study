package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj20336_HaughtyCuisine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        List<String> menu = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken());
        for (int i = 0; i < d; i++) {
            menu.add(st.nextToken());
        }

        sb.append(d).append("\n");
        for (int i = 0; i < menu.size(); i++) {
            sb.append(menu.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}
