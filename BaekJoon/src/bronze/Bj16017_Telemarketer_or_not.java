package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj16017_Telemarketer_or_not {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        if ((arr[0] == 8 || arr[0] == 9) && (arr[3] == 8 || arr[3] == 9) && arr[1] == arr[2]) {
            System.out.println("ignore");
        } else {
            System.out.println("answer");
        }
    }
}
