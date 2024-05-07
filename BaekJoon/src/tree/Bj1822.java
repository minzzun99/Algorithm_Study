package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Bj1822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Set<Integer> set = new TreeSet<>();
        st = new StringTokenizer(br.readLine(), " ");
        while (a-- > 0) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine(), " ");
        while (b-- > 0) {
            set.remove(Integer.parseInt(st.nextToken()));
        }
        sb.append(set.size()).append('\n');
        if (set.size() != 0) {
            set.stream().mapToInt(Integer::intValue).forEach(i -> sb.append(i + " "));
        }
        System.out.println(sb);
    }
}
