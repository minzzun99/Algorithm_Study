package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj20839_Betygsättning {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int z1 = Integer.parseInt(st.nextToken());

        if (x1 == x && y1 == y && z1 == z) {
            System.out.println("A");
        } else if (x1 >= (x + 1) / 2 && y1 == y && z1 == z) {
            System.out.println("B");
        } else if (y1 == y && z1 == z) {
            System.out.println("C");
        } else if (y1 >= (y + 1) / 2 && z1 == z) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}
