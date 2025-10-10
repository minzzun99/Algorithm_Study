package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj31746_SciComLove {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String result = "SciComLove";
        StringBuilder sb = new StringBuilder(result);
        if (N % 2 == 0) {
            System.out.println(result);
        } else {
            System.out.println(sb.reverse());
        }
    }
}
