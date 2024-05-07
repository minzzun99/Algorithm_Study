package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Bj5568 {
    private static int n, k;
    private static Set<String> set = new HashSet<>();
    private static boolean[] visited;
    private static String[] arr;

    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); // 카드 장 수
        k = Integer.parseInt(br.readLine()); // 몇장 선택
        arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        visited = new boolean[n];
        selectCard(k, "");
        System.out.println(set.size());
    }

    public static void selectCard(int r, String s) {
        if(r == 0) {
            set.add(s);
            return;
        }
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                selectCard(r-1, s + arr[i]);
                visited[i] = false;
            }
        }
    }
}
