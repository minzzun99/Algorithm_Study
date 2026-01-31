package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj34934_신규학과 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            String department = st.nextToken();
            int year = Integer.parseInt(st.nextToken());
            if (year == 2026) {
                System.out.println(department);
                break;
            }
        }
    }
}
