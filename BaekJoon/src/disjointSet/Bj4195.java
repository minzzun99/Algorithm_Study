package disjointSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj4195 {
    static int[] parent;        // 유니온 파인드 루트 노드 배열
    static int[] level;         // 각 노드마다 층의 개수
    public static int union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a != b) {
            if (a < b) {
                parent[b] = a;      //union
                level[a] += level[b];   // 친구 수도 합하기
                return level[a];
            } else {
                parent[a] = b;      //union
                level[b] += level[a];   // 친구 수도 합하기
                return level[b];
            }
        }
        return level[a];
    }

    public static int find(int a) {
        if (parent[a] == a) {
            return a;
        }
        return parent[a] = find(parent[a]);        //경로 압축
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int F = Integer.parseInt(br.readLine());
            parent = new int[F * 2];        // 2명씩 F번 입력
            level = new int[F * 2];

            for (int i = 0; i < F * 2; i++) {
                parent[i] = i;
                level[i] = 1;
            }

            int index = 0;
            Map<String, Integer> hashMap = new HashMap<>();

            for (int i = 0; i < F; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                String str1 = st.nextToken();
                String str2 = st.nextToken();
                if (!hashMap.containsKey(str1)) { //해당 친구이름이 아직 없는 경우 인덱스 부여
                    hashMap.put(str1, index++);
                }
                if (!hashMap.containsKey(str2)) {
                    hashMap.put(str2, index++);
                }

                sb.append(union(hashMap.get(str1), hashMap.get(str2))).append('\n');
            }
        }
        System.out.println(sb);
    }
}
