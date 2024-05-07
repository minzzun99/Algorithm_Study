package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bj1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(br.readLine());
        if(x == 1) {
            System.out.println("1/1");
            return;
        }
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 1; sum <= x; i++) {
            if(sum == x) {
                break;
            }
            list.add(sum + i);
            sum += i;
        }

        int n = list.size();        //리스트의 크기가 몇번째 줄인지
        int idx = list.get(n - 2);      // 전 리스트의 크기
        int sun = x - idx;
        int mom = n - sun + 1;
        if(n % 2 == 0) {
            sb.append(sun).append('/').append(mom);
        } else {
            sb.append(mom).append('/').append(sun);
        }
        System.out.println(sb);
    }
}
