package disjointSet;

import java.io.*;
import java.util.StringTokenizer;

public class Bj1717 {
    //parent 배열은 인덱스는 자기 자신, 값은 부모 노드;
    public static int[] parent;

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            if (a > b) {
                parent[a] = b;
            } else {
                parent[b] = a;
            }
        }
    }

    private static int find(int a) {
        if (parent[a] == a) {
            return a;
        }
        return parent[a] = find(parent[a]);         // 경로 압축하는 코드
        // return find(parent[a]);          // 이렇게하면 파인드 연산의 비용이 높아지기 때문에 부모노드로 초기화 시킴
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parent = new int[n + 1];
        // 집합 초기화
        for (int i = 1; i < parent.length; i++) {
            parent[i] = i;
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int command = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 0이 입력되면 유니온
            if (command == 0) {
                union(a, b);
            } else {
                if (find(a) == find(b)) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }
        System.out.println(sb);
    }
}
