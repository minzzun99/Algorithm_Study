package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj31518_TripleSevens {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[3];
        boolean flag = true;
        StringTokenizer st;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int x = Integer.parseInt(st.nextToken());
                if (x == 7) {
                    arr[i] = true;
                    break;
                }
            }

            if (!arr[i]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("777");
        } else {
            System.out.println(0);
        }
    }
}
