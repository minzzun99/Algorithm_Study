package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Bj2002_추월 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String carNum = br.readLine();
            map.put(carNum, i);
        }

        int[] out = new int[N];     // 나가는 순서 저장
        for (int i = 0; i < N; i++) {
            String selectNum = br.readLine();
            out[i] = map.get(selectNum);
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (out[i] > out[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
