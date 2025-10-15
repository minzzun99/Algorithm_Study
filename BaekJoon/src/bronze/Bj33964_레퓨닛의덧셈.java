package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj33964_레퓨닛의덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        String xNum = "1".repeat(X);
        String yNum = "1".repeat(Y);

        System.out.println(Integer.parseInt(xNum) + Integer.parseInt(yNum));
    }
}
