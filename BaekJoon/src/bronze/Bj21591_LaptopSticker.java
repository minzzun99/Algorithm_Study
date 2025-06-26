package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj21591_LaptopSticker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int wC = Integer.parseInt(st.nextToken());
        int hC = Integer.parseInt(st.nextToken());
        int wS = Integer.parseInt(st.nextToken());
        int hS = Integer.parseInt(st.nextToken());

        int resultW = wC - 2;
        int resultH = hC - 2;
        if (wS <= resultW && hS <= resultH) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
