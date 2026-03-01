package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj35370_MemoriesofPassportControl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        if (s % k == 0) {
            System.out.println(s / k);
        } else {
            int count = (s - (k * (s / k))) + (s / k);
            System.out.println(count);
        }
    }
}
