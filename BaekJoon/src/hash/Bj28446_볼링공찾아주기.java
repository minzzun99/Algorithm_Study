package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Bj28446_볼링공찾아주기 {
    private static HashMap<Integer, Integer> map;
    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        map = new HashMap<>();
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int command = Integer.parseInt(st.nextToken());
            if (command == 1) {
                int x = Integer.parseInt(st.nextToken());
                int w = Integer.parseInt(st.nextToken());
                inputBall(x, w);
            } else {
                int w = Integer.parseInt(st.nextToken());
                findBall(w);
            }
        }
        System.out.println(sb);
    }

    private static void inputBall(int x, int w) {
        map.put(w, x);
    }

    private static void findBall(int w) {
        sb.append(map.get(w)).append('\n');
    }
}

