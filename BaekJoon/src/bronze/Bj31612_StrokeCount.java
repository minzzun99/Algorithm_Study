package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Bj31612_StrokeCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> strokes = Map.of(
                'j', 2,
                'o', 1,
                'i', 2
        );

        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();

        int count = 0;
        for (int i = 0; i < N; i++) {
            count += strokes.get(S.charAt(i));
        }

        System.out.println(count);
    }
}
