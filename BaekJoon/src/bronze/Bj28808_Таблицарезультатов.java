package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj28808_Таблицарезультатов {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][m];
        int total = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        for(int i = 0; i < n; i++) {
            int find = 0;
            for(int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == '+') {
                    find = 1;
                    break;
                }
            }

            if(find == 1) {
                total++;
            }
        }

        System.out.println(total);
    }
}
