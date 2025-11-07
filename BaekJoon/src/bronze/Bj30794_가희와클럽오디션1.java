package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj30794_가희와클럽오디션1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lv = Integer.parseInt(st.nextToken());
        String str = st.nextToken();

        int score = 0;
        if (str.equals("bad")) {
            score = lv * 200;
        } else if (str.equals("cool")) {
            score = lv * 400;
        } else if (str.equals("great")) {
            score = lv * 600;
        } else if (str.equals("perfect")) {
            score = lv * 1000;
        }

        System.out.println(score);
    }
}
