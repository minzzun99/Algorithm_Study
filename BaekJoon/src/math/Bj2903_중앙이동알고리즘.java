package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2903_중앙이동알고리즘 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long square = Math.round(Math.pow(2, n));
        long result = Math.round(Math.pow(square + 1, 2));
        System.out.println(result);
    }
}
