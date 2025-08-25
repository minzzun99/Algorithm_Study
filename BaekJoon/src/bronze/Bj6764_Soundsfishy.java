package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj6764_Soundsfishy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if (arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3]) {
            System.out.println("Fish Rising");
        } else if (arr[0] > arr[1] && arr[1] > arr[2] && arr[2] > arr[3]) {
            System.out.println("Fish Diving");
        } else if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
            System.out.println("Fish At Constant Depth");
        } else {
            System.out.println("No Fish");
        }
    }
}
