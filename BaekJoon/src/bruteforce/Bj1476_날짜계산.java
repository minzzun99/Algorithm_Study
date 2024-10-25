package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1476_날짜계산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count = 1;
        int startE = 1;
        int startS = 1;
        int startM = 1;
        while (true) {
            if (startE == E && startS == S && startM == M) {
                break;
            }

            startE++;
            startS++;
            startM++;
            count++;

            if (startE > 15) {
                startE = 1;
            }

            if (startS > 28) {
                startS = 1;
            }

            if (startM > 19) {
                startM = 1;
            }
        }

        System.out.println(count);
    }
}
