package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj28927_Киноманы {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] times = {3, 20, 120};
        int max = 0;
        int mel = 0;
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 3; i++) {
            max += (Integer.parseInt(st1.nextToken()) * times[i]);
            mel += (Integer.parseInt(st2.nextToken()) * times[i]);
        }

        if (max > mel) {
            System.out.println("Max");
        } else if (max == mel) {
            System.out.println("Draw");
        } else {
            System.out.println("Mel");
        }
    }
}
