package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj8370_plane {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N1 = Integer.parseInt(st.nextToken());
        int K1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());
        int K2 = Integer.parseInt(st.nextToken());
        int totalSeats = (N1 * K1) + (N2 * K2);
        System.out.println(totalSeats);
    }
}
