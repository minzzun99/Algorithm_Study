package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj18111_마인크래프트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());       //N개 줄
        int M = Integer.parseInt(st.nextToken());       //M개의 열
        int B = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];

        int max = 0;
        int min = 256;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        int time = Integer.MAX_VALUE;
        int height = 0;
        for (int i = min; i <= max; i++) {
            int count = 0;
            int block = B;
            for(int x = 0; x < N; x++) {
                for(int y = 0; y < M; y++) {
                    if(i < arr[x][y]) {
                        count += ((arr[x][y] - i) * 2);
                        block += (arr[x][y] - i);
                    }else {
                        count += (i - arr[x][y]);
                        block -= (i - arr[x][y]);
                    }
                }
            }
            if(block < 0) continue;

            if(time >= count) {
                time = count;
                height = i;
            }
        }
        System.out.println(time + " " + height);
    }
}
