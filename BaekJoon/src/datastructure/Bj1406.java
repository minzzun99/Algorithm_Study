package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Bj1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        LinkedList<Character> strList = new LinkedList<>();

        for (char c : str.toCharArray()) {
            strList.add(c);
        }

        int N = Integer.parseInt(br.readLine());
        ListIterator<Character> listIterator = strList.listIterator(strList.size());
        StringTokenizer st;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            String s = st.nextToken();
            if (s.equals("P")) {
                char c = st.nextToken().charAt(0);
                listIterator.add(c);
            } else if (s.equals("L")) {
                if (listIterator.hasPrevious()) {
                    listIterator.previous();
                }
            } else if (s.equals("D")) {
                if (listIterator.hasNext()) {
                    listIterator.next();
                }
            } else {
                if (listIterator.hasPrevious()) {
                    listIterator.previous();
                    listIterator.remove();
                }
            }
        }
        for (char c : strList) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
