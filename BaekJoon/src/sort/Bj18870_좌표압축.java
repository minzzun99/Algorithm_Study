package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Bj18870_좌표압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int i = 0; i < sortArr.length; i++) {
            if (!map.containsKey(sortArr[i])) {
                map.put(sortArr[i], rank);
                rank++;
            } else {
                continue;
            }
        }

        for (int i : arr) {
            sb.append(map.get(i)).append(' ');
        }
        System.out.println(sb);
    }
}
