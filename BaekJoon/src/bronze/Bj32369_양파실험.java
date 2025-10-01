package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj32369_양파실험 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int X = 1;
        int Y = 1;
        for(int i = 0; i < N; i++){
            int temp = 0;
            X += A;
            Y += B;

            if (X < Y) {
                temp = X;
                X = Y;
                Y = temp;
            } else if (X == Y) {
                Y = Y - 1;
            }
        }

        System.out.println(X + " " + Y);
    }
}
