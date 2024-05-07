package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N==1) {
            System.out.println(0);
        }else {
            int[] arrX = new int[N];
            int[] arrY = new int[N];
            for(int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                arrX[i] = Integer.parseInt(st.nextToken());
                arrY[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arrX);
            Arrays.sort(arrY);
            int area = (arrX[N-1] - arrX[0]) * (arrY[N-1] - arrY[0]);
            System.out.println(area);
        }
    }
}
