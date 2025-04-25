package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj17826_나의학점은 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<Integer> score = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            score.add(Integer.parseInt(st.nextToken()));
        }
        score.sort(Collections.reverseOrder());

        int target = Integer.parseInt(br.readLine());
        int rank = 0;
        for (int i = 0; i < score.size(); i++) {
            if (score.get(i) == target) {
                rank = i + 1;
            }
        }

        System.out.println(getGrade(rank));
    }

    private static String getGrade(int rank) {
        if (1 <= rank && rank <= 5) {
            return "A+";
        } else if(6 <= rank && rank <= 15) {
            return "A0";
        } else if(16 <= rank && rank <= 30) {
            return "B+";
        } else if(31 <= rank && rank <= 35) {
            return "B0";
        } else if(36 <= rank && rank <= 45) {
            return "C+";
        } else if (46 <= rank && rank <= 48) {
            return "C0";
        } else {
            return "F";
        }
    }
}
