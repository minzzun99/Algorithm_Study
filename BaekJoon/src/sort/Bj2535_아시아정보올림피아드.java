package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Bj2535_아시아정보올림피아드 {
    private static class Student {
        int countryNum;
        int stdNum;
        int score;

        Student(int countryNum, int stdNum, int score) {
            this.countryNum = countryNum;
            this.stdNum = stdNum;
            this.score = score;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        ArrayList<Student> stdList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int countryNum = Integer.parseInt(st.nextToken());
            int stdNum = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());

            stdList.add(new Student(countryNum, stdNum, score));
        }
        Collections.sort(stdList, (o1, o2) -> {
            return Integer.compare(o2.score, o1.score);
        });

        Student gold = stdList.get(0);
        Student silver = stdList.get(1);
        int bronzeNum = 2;
        if (gold.countryNum == silver.countryNum) {
            for (int i = 2; i < N; i++) {
                if (gold.countryNum != stdList.get(i).countryNum) {
                    bronzeNum = i;
                    break;
                }
            }
        }
        sb.append(gold.countryNum).append(' ').append(gold.stdNum).append('\n');
        sb.append(silver.countryNum).append(' ').append(silver.stdNum).append('\n');
        sb.append(stdList.get(bronzeNum).countryNum).append(' ').append(stdList.get(bronzeNum).stdNum);
        System.out.println(sb);
    }
}
