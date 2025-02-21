package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bj28431_양말짝맞추기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> number = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(br.readLine());
            if (number.contains(n)) {
                number.remove(n);
            } else {
                number.add(n);
            }
        }

        Iterator<Integer> list = number.iterator();
        System.out.println(list.next());
    }
}
