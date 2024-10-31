package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj20044_ProjectTeams {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> students = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 2 * N; i++) {
            students.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(students);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int score = students.get(i) + students.get(N * 2 - 1 - i);
            min = Math.min(min, score);
        }

        System.out.println(min);
    }
}
