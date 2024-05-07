package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            LinkedList<int[]> queue = new LinkedList<>();
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st1.nextToken());      // 문서의 개수
            int M = Integer.parseInt(st1.nextToken());      // 궁금한 문서

            for (int i = 0; i < N; i++) {
                queue.add(new int[]{i, Integer.parseInt(st2.nextToken())});
            }
            int count = 0;
            while (!queue.isEmpty()) {
                int[] first = queue.poll();
                boolean chk = true;     // 중요도가 높은게 있는지
                for (int i = 0; i < queue.size(); i++) {
                    if (first[1] < queue.get(i)[1]) {
                        queue.add(first);
                        for (int j = 0; j < i; j++) {
                            queue.add(queue.poll());
                        }
                        chk = false;
                        break;
                    }
                }

                if(chk == false) {
                    continue;
                }

                // front 원소가 가장 큰 원소였으므로 해당 원소는 출력해야하는 문서다.
                count++;
                if(first[0] == M) {	// 찾고자 하는 문서라면 해당 테스트케이스 종료
                    break;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}


