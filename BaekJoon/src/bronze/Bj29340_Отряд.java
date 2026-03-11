package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj29340_Отряд {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] arr1 = br.readLine().toCharArray();
        char[] arr2 = br.readLine().toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) {
                sb.append(arr1[i]);
            } else {
                sb.append(arr2[i]);
            }
        }

        System.out.println(sb);
    }
}
