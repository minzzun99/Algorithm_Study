package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj29713_띠부띠부씰 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1 = new int[26];
        String goldChip = "BRONZESILVER";
        for (int i = 0; i < goldChip.length(); i++) {
            int ind = goldChip.charAt(i) - 'A';
            arr1[ind]++;
        }

        int N = Integer.parseInt(br.readLine());
        int[] arr2 = new int[26];
        String bsChip = br.readLine();
        for (int i = 0; i < N; i++) {
            int ind = bsChip.charAt(i) - 'A';
            arr2[ind]++;
        }

        int count = 0;
        while (true) {
            boolean flag = true;
            for (int i = 0; i < 26; i++) {
                if (arr2[i] < arr1[i]) {
                    flag = false;
                    break;
                } else {
                    arr2[i] -= arr1[i];
                }
            }
            if (!flag) {
                break;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
