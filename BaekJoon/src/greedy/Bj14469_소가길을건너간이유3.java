package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj14469_소가길을건너간이유3 {
    private static class Cow {
        int arrivalTime;
        int checkTime;

        Cow(int arrivalTime, int checkTime) {
            this.arrivalTime = arrivalTime;
            this.checkTime = checkTime;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Cow[] cows = new Cow[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int arrivalTime = Integer.parseInt(st.nextToken());
            int checkTime = Integer.parseInt(st.nextToken());
            cows[i] = new Cow(arrivalTime, checkTime);
        }

        Arrays.sort(cows, (o1, o2) -> {
            return Integer.compare(o1.arrivalTime, o2.arrivalTime);
        });

        int sum = cows[0].arrivalTime + cows[0].checkTime;
        for (int i = 1; i < cows.length; i++) {
            if (sum > cows[i].arrivalTime) {
                sum += cows[i].checkTime;
            } else {
                sum += (cows[i].arrivalTime - sum) + cows[i].checkTime;
            }
        }

        System.out.println(sum);
    }
}
