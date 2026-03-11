package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj20546_기적의매매법 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cost = Integer.parseInt(br.readLine());
        int[] arr = new int[14];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int jResult = calculateBnp(arr, cost);
        int sResult = calculateTiming(arr, cost);
        if (jResult > sResult) {
            System.out.println("BNP");
        } else if (jResult == sResult) {
            System.out.println("SAMESAME");
        } else {
            System.out.println("TIMING");
        }
    }

    private static int calculateBnp(int[] arr, int cost) {
        int stock = 0;
        for (int j : arr) {
            stock += cost / j;
            cost = cost % j;
        }

        return cost + (stock * arr[arr.length - 1]);
    }

    private static int calculateTiming(int[] arr, int cost) {
        int stock = 0;
        for (int i = 3; i < arr.length; i++) {
            if (arr[i - 3] > arr[i - 2] && arr[i - 2] > arr[i - 1]) {
                stock += cost / arr[i];
                cost = cost % arr[i];
                continue;
            }

            if (arr[i - 3] < arr[i - 2] && arr[i - 2] < arr[i - 1]) {
                cost += arr[i] * stock;
                stock = 0;
            }
        }
        return cost + (stock * arr[arr.length - 1]);
    }
}
