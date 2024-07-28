package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1297_TV크기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        double pow = Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2));
        double num = Math.sqrt(pow);
        System.out.println((int)(H * num) + " " + (int)(W * num));
    }
}
