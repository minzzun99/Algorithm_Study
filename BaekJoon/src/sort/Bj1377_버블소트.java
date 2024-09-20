package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;

public class Bj1377_버블소트 {
    private static int N;
    private static Node[] nodeArr;

    private static class Node {
        int idx;
        int num;

        Node(int idx, int num) {
            this.idx = idx;
            this.num = num;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        nodeArr = new Node[N];
        for (int i = 0; i < N; i++) {
            nodeArr[i] = new Node(i, Integer.parseInt(br.readLine()));
        }

        Arrays.sort(nodeArr, (o1, o2) -> o1.num - o2.num);

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, nodeArr[i].idx - i);
        }

        System.out.println(max + 1);
    }
}
