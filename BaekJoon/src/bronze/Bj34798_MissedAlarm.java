package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj34798_MissedAlarm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int hourA = Integer.parseInt(st.nextToken());
        int minuteA = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), ":");
        int hourB = Integer.parseInt(st.nextToken());
        int minuteB = Integer.parseInt(st.nextToken());

        if (hourB > hourA) {
            System.out.println("YES");
        } else if (hourB == hourA) {
            if (minuteB > minuteA) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
