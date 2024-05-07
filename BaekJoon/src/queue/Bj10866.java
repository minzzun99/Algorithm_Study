    package queue;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayDeque;
    import java.util.Deque;
    import java.util.StringTokenizer;

    public class Bj10866 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st;

            Deque<Integer> deque = new ArrayDeque<>();

            while (N-- > 0) {
                st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                if (str.equals("push_front")) {
                    int x = Integer.parseInt(st.nextToken());
                    deque.addFirst(x);
                } else if (str.equals("push_back")) {
                    int x = Integer.parseInt(st.nextToken());
                    deque.addLast(x);
                } else if (str.equals("pop_front")) {
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.pollFirst()).append('\n');
                    }
                } else if (str.equals("pop_back")) {
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.pollLast()).append('\n');
                    }
                } else if (str.equals("size")) {
                    sb.append(deque.size()).append('\n');
                } else if (str.equals("empty")) {
                    if (deque.isEmpty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                } else if (str.equals("front")) {
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.peekFirst()).append('\n');
                    }
                } else {
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.peekLast()).append('\n');
                    }
                }
            }
            System.out.println(sb);
        }
    }
