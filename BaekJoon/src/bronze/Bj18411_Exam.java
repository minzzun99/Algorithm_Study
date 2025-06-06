package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj18411_Exam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.get(0) + list.get(1));
    }
}
