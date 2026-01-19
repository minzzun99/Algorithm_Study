package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj31281_ЗЛАТНАТАСРЕДА {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Long> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Long.parseLong(st.nextToken()));
        }

        Collections.sort(list);
        System.out.println(list.get(1));
    }
}
