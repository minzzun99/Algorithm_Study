package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj2108_통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);

        int count = 0;
        int max = -1;
        int mod = arr[0];
        boolean check = false;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 0;
            }
            if(max < count) {
                max = count;
                mod = arr[i];
                check = true;
            }else if(max == count && check == true) {
                mod = arr[i];
                check = false;
            }
        }

        int median = arr[(n - 1) / 2];
        int range = arr[n - 1] - arr[0];
        String s = String.format("%.0f", sum / n);
        sb.append(s).append('\n');
        sb.append(median).append('\n');
        sb.append(mod).append('\n');
        sb.append(range);
        System.out.println(sb);
    }
}
