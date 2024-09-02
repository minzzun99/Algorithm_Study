package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj1946_신입사원 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            Applicant[] applicants = new Applicant[N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                applicants[i] = new Applicant(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }

            Arrays.sort(applicants, ((o1, o2) -> {
                return o1.document - o2.document;
            }));

            int passCount = 1;
            int minInter = applicants[0].interview;
            for (int i = 1; i < N; i++) {
                if (applicants[i].interview < minInter) {
                    passCount++;
                    minInter = applicants[i].interview;
                }
            }

            sb.append(passCount).append('\n');
        }
        System.out.println(sb);
    }

    private static class Applicant {
        int document;
        int interview;

        Applicant(int document, int interview) {
            this.document = document;
            this.interview = interview;
        }
    }
}
