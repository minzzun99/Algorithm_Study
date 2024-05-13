package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1074_Z {
    private static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int size = (int)Math.pow(2, N);

        visit(r, c, size);
        System.out.println(count);
    }

    private static void visit(int r, int c, int size) {
        if (size == 1) {
            return;
        }
        if (r < size / 2 && c < size / 2) {     //1사분면
            visit(r, c, size / 2);
        } else if (r < size / 2 && c >= size / 2) {     //2사분면
            count += size * size / 4;
            visit(r, c - size / 2, size / 2);
        } else if (r >= size / 2 && c < size / 2) {     //3사분면
            count += (size*size / 4) * 2;
            visit(r - size / 2, c, size / 2);
        } else {
            count += (size * size / 4) * 3;
            visit(r - size / 2, c - size / 2, size / 2);
        }
    }
}
