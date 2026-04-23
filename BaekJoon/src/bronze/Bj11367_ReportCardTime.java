package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj11367_ReportCardTime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            sb.append(name).append(" ").append(getGrade(score));
        }

        System.out.println(sb);
    }

    private static String getGrade(int score) {
        if (score >= 97) {
            return "A+\n";
        } else if (score >= 90) {
            return "A\n";
        } else if (score >= 87) {
            return "B+\n";
        } else if (score >= 80) {
            return "B\n";
        } else if (score >= 77) {
            return "C+\n";
        } else if (score >= 70) {
            return "C\n";
        } else if (score >= 67) {
            return "D+\n";
        } else if (score >= 60) {
            return "D\n";
        } else {
            return "F\n";
        }
    }
}
