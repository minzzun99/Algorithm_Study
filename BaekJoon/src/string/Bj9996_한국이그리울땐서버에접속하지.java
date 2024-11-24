package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj9996_한국이그리울땐서버에접속하지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), "*");
        String start = st.nextToken();
        String end = st.nextToken();

        while (N-- > 0) {
            if (checkFileName(start, end, br.readLine())) {
                sb.append("DA").append('\n');
            } else {
                sb.append("NE").append('\n');
            }
        }

        System.out.println(sb);
    }

    private static boolean checkFileName(String start, String end, String file) {
        if (start.length() + end.length() > file.length()) {
            return false;
        }

        return file.startsWith(start) && file.endsWith(end);
    }
}
