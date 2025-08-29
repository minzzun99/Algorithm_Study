package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj17450_과자사기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        double bestScore = 0;
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double price = Double.parseDouble(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());

            double score = 0;
            if (price * 10 >= 5000) {
                score = (weight * 10) / (price * 10 - 500);
            } else {
                score = (weight * 10) / (price * 10);
            }

            if(bestScore < score){
                bestScore = score;
                if (i == 0) {
                    result = "S";
                } else if (i == 1) {
                    result = "N";
                } else {
                    result = "U";
                }
            }
        }

        System.out.println(result);
    }
}
