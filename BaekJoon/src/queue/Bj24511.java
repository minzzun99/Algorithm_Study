package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());        //자료구조의 개수
        int[] structure = new int[N];
        int[] element = new int[N];
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");      // 구조 입력
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");      // 수열 원소 입력
        for (int i = 0; i < N; i++) {
            structure[i] = Integer.parseInt(st1.nextToken());
            element[i] = Integer.parseInt(st2.nextToken());
        }

        int M = Integer.parseInt(br.readLine());        // 삽입할 원소의 개수
        int[] add = new int[M];
        StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");      // 삽입할 원소 입력
        for (int i = 0; i < M; i++) {
            add[i] = Integer.parseInt(st3.nextToken());
        }

        Deque<Integer> queue = new ArrayDeque<>();
        // 자료구조의 형태가 큐라면,
        for (int i = 0; i < N; i++) {
            if (structure[i] == 0) {
                queue.addFirst(element[i]); // 새로 만든 큐에 현재 요소를 담는다.
            }
        }
        for (int i = 0; i < M; i++) {
            queue.add(add[i]);
            sb.append((queue.pollFirst() + " "));
        }

        System.out.println(sb);
    }
}
