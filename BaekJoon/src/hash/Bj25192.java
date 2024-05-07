package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Bj25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> hashSet = new HashSet<>();
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        while (N-- > 0) {
            String str = br.readLine();
            if (str.equals("ENTER")) {
                //set에 원소가 있으면 count에 값을 더하고 전부 제거
                if (hashSet.size() > 0) {
                    count += hashSet.size();
                    hashSet.clear();
                }
            } else {
                hashSet.add(str);
            }
        }
        // 마지막 엔터 이후에 쌓인 set 원소 count에 더해주기
        count += hashSet.size();

        System.out.println(count);
    }
}
