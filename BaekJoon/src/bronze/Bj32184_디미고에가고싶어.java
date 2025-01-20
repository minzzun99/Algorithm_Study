package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj32184_디미고에가고싶어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        if (A % 2 == 0 && B % 2 != 0) {
            System.out.println((B - A) / 2 + 2);
        } else {
            System.out.println((B - A) / 2 + 1);
        }
    }
}
