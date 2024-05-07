package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1021_deque활용 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            deque.add(i);
            list.add(i);
        }
        st = new StringTokenizer(br.readLine(), " ");
        int count = 0;
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(st.nextToken());

            if (deque.peekFirst() != x) {
                int index = 0;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) == x) {
                        index = j;
                        break;
                    }
                }
                while (deque.peekFirst() != x) {
                    if((list.size() / 2)>= index) {
                        // 앞쪽에 있는 경우
                        deque.addLast(deque.pollFirst());
                        list.add(list.get(0));
                        list.remove(0);
                        index--;
                    } else {
                        // 뒷쪽에 있는 경우
                        deque.addFirst(deque.pollLast());
                        list.add(0, list.get(list.size() - 1));
                        list.remove(list.size() - 1);
                        index++;
                    }
                    count++;
                }
                if (deque.peekFirst() == x) {
                    deque.pollFirst();
                    list.removeFirst();
                }
            } else {
                deque.pollFirst();
                list.removeFirst();
            }
        }
        System.out.println(count);
    }
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }
        st = new StringTokenizer(br.readLine(), " ");
        int count = 0;
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(st.nextToken());

            while (deque.getFirst() != x) {
                if (deque.indexOf(x) <= (deque.size() / 2)) {
                    // 앞에 있을 때
                    deque.addLast(deque.getFirst());
                    deque.removeFirst();
                } else {
                    deque.addFirst(deque.getLast());
                    deque.removeLast();
                }
                count++;
            }
            if(deque.getFirst() == x) {
                deque.removeFirst();
            }
        }
        System.out.println(count);
    }*/
}
