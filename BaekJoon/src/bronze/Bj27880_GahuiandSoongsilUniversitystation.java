package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj27880_GahuiandSoongsilUniversitystation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int total = 0;
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int x = Integer.parseInt(st.nextToken());
            if (str.equals("Es")) {
                total += x * 21;
            } else if (str.equals("Stair")) {
                total += x * 17;
            }
        }

        System.out.println(total);
    }
}
