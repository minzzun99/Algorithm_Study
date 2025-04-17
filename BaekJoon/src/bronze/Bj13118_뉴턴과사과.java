package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj13118_뉴턴과사과 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        int X = Integer.parseInt(st.nextToken());
        st.nextToken();
        st.nextToken();

        boolean flag = false;
        for (int i = 0; i < 4; i++) {
            if (arr[i] == X) {
                System.out.println(i + 1);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println(0);
        }
    }
}
