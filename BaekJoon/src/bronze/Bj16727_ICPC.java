package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj16727_ICPC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p1 = Integer.parseInt(st.nextToken());
        int s1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int s2 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());

        if (p1 + p2 > s1 + s2) {
            System.out.print("Persepolis");
        }
        else if (p1 + p2 < s1 + s2) {
            System.out.print("Esteghlal");
        }
        else if (p1 + p2 == s1 + s2) {
            if (p2 > s1) {
                System.out.print("Persepolis");
            }
            else if (p2 < s1) {
                System.out.print("Esteghlal");
            }
            else {
                System.out.print("Penalty");
            }
        }
    }
}
