package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Bj21939_문제추천시스템Version1 {
    private static class Problem {
        int number;
        int level;

        Problem(int number, int level) {
            this.number = number;
            this.level = level;
        }
    }

    private static HashMap<Integer, Integer> map;
    private static TreeSet<Problem> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        set = new TreeSet<>((o1, o2) -> {
            if (o1.level == o2.level) {
                return o1.number - o2.number;
            } else {
                return o1.level - o2.level;
            }
        });
        map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            int lv = Integer.parseInt(st.nextToken());
            set.add(new Problem(num, lv));
            map.put(num, lv);
        }

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("recommend")) {
                int x = Integer.parseInt(st.nextToken());
                sb.append(recommend(x)).append('\n');
            } else if (command.equals("add")) {
                int P = Integer.parseInt(st.nextToken());
                int L = Integer.parseInt(st.nextToken());
                add(P, L);
            } else {
                int P = Integer.parseInt(st.nextToken());
                solved(P);
            }
        }
        System.out.println(sb);
    }

    private static int recommend(int x) {
        if (x == 1) {
            return set.last().number;
        } else {
            return set.first().number;
        }
    }

    private static void add(int p, int l) {
        map.put(p, l);
        set.add(new Problem(p, l));
    }

    private static void solved(int p) {
        int l = map.get(p);
        map.remove(p);
        set.remove(new Problem(p, l));
    }
}