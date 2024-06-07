package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj5430_AC {
    private static StringTokenizer st;
    private static boolean isRight;
    private static Deque<Integer> deque;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arrString = br.readLine();
            changeArray(arrString);
            isRight = true;
            boolean flag = true;
            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) == 'R') {
                    isRight = !isRight;
                }else{
                    if (!deque.isEmpty()) {
                        if (isRight) {
                            deque.removeFirst();
                        } else {
                            deque.removeLast();
                        }
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                List<Integer> list = new ArrayList<>();
                if (isRight) {
                    while (!deque.isEmpty()) {
                        list.add(deque.pollFirst());
                    }
                    sb.append(list.toString().replace(" ","")).append('\n');
                } else {
                    while (!deque.isEmpty()) {
                        list.add(deque.pollLast());
                    }
                    sb.append(list.toString().replace(" ","")).append('\n');
                }
            } else {
                sb.append("error").append('\n');
            }
        }
        System.out.println(sb);
    }

    private static void changeArray(String string) {
        String str = string.replace("[", "");
        str = str.replace("]", "");
        str = str.replace(",", " ");
        st = new StringTokenizer(str, " ");
        deque = new ArrayDeque<>();
        while (st.hasMoreTokens()) {
            deque.add(Integer.parseInt(st.nextToken()));
        }
    }
}
