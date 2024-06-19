package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj2246_콘도선정 {
    private static class Condo {
        int D;
        int C;

        public Condo(int D, int C) {
            this.D = D;
            this.C = C;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Condo[] arr = new Condo[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int D = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            arr[i] = new Condo(D, C);
        }
        Arrays.sort(arr, (o1,o2) ->{
            if (o1.D == o2.D) {
                return Integer.compare(o1.C, o2.C);
            } else {
                return Integer.compare(o1.D, o2.D);
            }
        });
        int count = 1;

        Condo X = arr[0];
        for (int i = 1; i < N; i++) {
            if (arr[i].D == X.D && arr[i].C < X.C) {
                count++;
                X = arr[i];
            } else {
                if (X.C > arr[i].C) {
                    count++;
                    X = arr[i];
                }
            }
        }
        System.out.println(count);
    }
}
