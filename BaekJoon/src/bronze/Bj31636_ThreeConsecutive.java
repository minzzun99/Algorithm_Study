package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj31636_ThreeConsecutive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        boolean flag = false;
        for(int i = 0; i < N - 2; i++) {
            if (S.charAt(i) == 'o' && S.charAt(i + 1) == 'o' && S.charAt(i + 2) == 'o') {
                flag = true;
                break;
            }
        }

        if(flag) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
