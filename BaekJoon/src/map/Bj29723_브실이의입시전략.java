package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj29723_브실이의입시전략 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Map<String, Integer> courses = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            courses.put(name, score);
        }

        int max = 0;
        int min = 0;
        for (int i = 0; i < K; i++) {
            String name = br.readLine();
            max += courses.get(name);
            min += courses.get(name);
            courses.remove(name);
        }

        List<Integer> scoreList = new ArrayList<>(courses.values());
        Collections.sort(scoreList);
        int index = 0;
        for (int i = K; i < M; i++) {
            max += scoreList.get(scoreList.size() - index - 1);
            min += scoreList.get(index);
            index++;
        }

        System.out.println(min + " " + max);
    }
}
