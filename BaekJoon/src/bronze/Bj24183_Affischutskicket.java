package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj24183_Affischutskicket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = 229 * 324 * Integer.parseInt(st.nextToken()) * 2;
        int y = 297 * 420 * Integer.parseInt(st.nextToken()) * 2;
        int z = 210 * 297 * Integer.parseInt(st.nextToken());

        System.out.println((x + y + z) * 0.000001);
    }
}
