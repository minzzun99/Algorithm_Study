package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj4952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            if(N == 0) {
                break;
            }

            int[] arr = new int[N];
            for(int i=0; i<N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                if(i == 0) {
                    System.out.print(arr[i] + " ");
                }
                if(i > 0) {
                    if(arr[i] != arr[i-1]) {
                        System.out.print(arr[i] + " ");
                    }
                }
            }
            System.out.println("$");
            /*Arrays.stream(arr)
                    .boxed()
                    .distinct()
                    .mapToInt(Integer::intValue)
                    .forEach( num -> System.out.print(num + " "));
            System.out.println("$");*/
        }
    }
}
