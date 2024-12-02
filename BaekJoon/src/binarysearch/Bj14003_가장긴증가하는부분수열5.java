package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Bj14003_가장긴증가하는부분수열5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[N + 1];
        int[] idxArr = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        list.add(Integer.MIN_VALUE);
        for (int i = 1; i <= N; i++) {
            int value = list.get(list.size() - 1);
            int num = arr[i];

            if (num > value) {
                list.add(num);
                idxArr[i] = list.size() - 1;
                continue;
            }

            int left = 0;
            int right = list.size() - 1;
            while (left < right) {
                int mid = (left + right) / 2;
                if (num > list.get(mid)) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            list.set(left, num);
            idxArr[i] = left;
        }

        sb.append(list.size() - 1).append('\n');

        Stack<Integer> stack = new Stack<>();
        int idxNum = list.size() - 1;
        for (int i = N; i >= 1; i--) {
            if (idxArr[i] == idxNum) {
                stack.push(arr[i]);
                idxNum--;
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(' ');
        }

        System.out.println(sb);
    }
}
