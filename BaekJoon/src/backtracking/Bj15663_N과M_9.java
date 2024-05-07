package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Bj15663_N과M_9 {
    private static int N, M;
    private static int[] result;
    private static int[] arr;
    private static boolean[] visited;
    private static ArrayList<ArrayList<Integer>> resultList;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        resultList = new ArrayList<>();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        result = new int[M];
        arr = new int[N];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        selectNum(0);
        resultList = resultList.stream().distinct().collect(Collectors.toCollection(ArrayList::new));
        for (ArrayList<Integer> list : resultList) {
            for (int num : list) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void selectNum(int depth) {
        if (depth == M) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i : result) {
                list.add(i);
            }
            resultList.add(list);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = arr[i];
                selectNum(depth + 1);
                visited[i] = false;
            }
        }
    }
}
