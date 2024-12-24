package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj20492_세금 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int reslut1 = (int) (N * 0.78);
        int result2 = (int) ((N * 0.8) + ((N * 0.2) * 0.78));
        System.out.println(reslut1 + " " + result2);
    }
}
