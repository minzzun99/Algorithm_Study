package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj30008_준영이의등급 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int [] grade = new int [K];
        int [] arr = new int [K];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            grade[i] = Integer.parseInt(st.nextToken());
            arr[i] = grade[i] * 100 / N;

            if (arr[i] <= 4){
                sb.append(1).append(" ");
            }else if(arr[i] <= 11){
                sb.append(2).append(" ");
            } else if (arr[i] <= 23) {
                sb.append(3).append(" ");
            }else if(arr[i] <= 40){
                sb.append(4).append(" ");
            }else if(arr[i] <= 60){
                sb.append(5).append(" ");
            }else if(arr[i] <= 77){
                sb.append(6).append(" ");
            }else if(arr[i] <= 89){
                sb.append(7).append(" ");
            }else if(arr[i] <= 96){
                sb.append(8).append(" ");
            }else {
                sb.append(9).append(" ");
            }
        }
        System.out.println(sb);
    }
}
