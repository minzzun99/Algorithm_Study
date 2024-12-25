package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10886_0notcute_1cute {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int notCute = 0;
        int cute = 0;
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(br.readLine()) == 0) {
                notCute++;
            } else {
                cute++;
            }
        }

        if (cute > notCute) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }
    }
}
