package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj17256_달달함이넘쳐흘러 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int ax = Integer.parseInt(st.nextToken());
        int ay = Integer.parseInt(st.nextToken());
        int az = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int cx = Integer.parseInt(st.nextToken());
        int cy = Integer.parseInt(st.nextToken());
        int cz = Integer.parseInt(st.nextToken());

        System.out.println(cx-az);
        System.out.println(cy/ay);
        System.out.println(cz-ax);
    }
}
