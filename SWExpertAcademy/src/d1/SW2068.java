package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW2068 {
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[10];
            for(int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            sb.append("#").append(i).append(" ").append(arr[arr.length-1]).append('\n');
        }
        System.out.println(sb);
    }*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int max = Integer.MIN_VALUE;
            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                if(num > max) {
                    max = num;
                }
            }
            sb.append("#").append(i).append(" ").append(max).append('\n');
        }
        System.out.println(sb);
    }
}
