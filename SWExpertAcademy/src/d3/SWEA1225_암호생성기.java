package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class SWEA1225_암호생성기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            br.readLine();
            int[] arr = new int[8];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 8; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int[] result = makeCode(arr);
            sb.append("#").append(i).append(" ");
            for (int j = 0; j < result.length; j++) {
                sb.append(result[j]).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    private static int[] makeCode(int[] arr) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            deque.add(arr[i]);
        }

        int minus = 1;
        while (true) {
            int now = deque.poll() - minus;
            minus++;
            if (minus > 5) {
                minus = 1;
            }

            if (now <= 0) {
                deque.add(0);
                break;
            }

            deque.add(now);
        }

        return deque.stream().mapToInt(Integer::intValue).toArray();
    }
}
