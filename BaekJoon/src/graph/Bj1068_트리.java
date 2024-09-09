package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj1068_트리 {
    private static int N, deleteNode, root;
    private static ArrayList<Integer>[] adjList;
    private static boolean[] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        adjList = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            adjList[i] = new ArrayList<>();
        }


        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        root = -1;
        for (int i = 0; i < N; i++) {
            int parent = Integer.parseInt(st.nextToken());
            if (parent == -1) {
                root = i;
                continue;
            }
            adjList[parent].add(i);
        }


        visited = new boolean[N];
        deleteNode = Integer.parseInt(br.readLine());
        if (deleteNode == root) {
            System.out.println(0);
        } else {
            int count = countLeafNode(root);
            System.out.println(count);
        }
    }

    private static int countLeafNode(int start) {
        visited[start] = true;
        if (start == deleteNode) {
            return 0;
        }

        boolean isLeaf = true;
        int leafCount = 0;
        for (int next : adjList[start]) {
            if (!visited[next] && next != deleteNode) {
                isLeaf = false;
                leafCount += countLeafNode(next);
            }
        }

        if (isLeaf) {
            return 1;
        }
        return leafCount;
    }
}
