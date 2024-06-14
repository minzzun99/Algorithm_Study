package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj4821_페이지세기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int page = Integer.parseInt(br.readLine());
            if (page == 0) {
                System.out.println(sb);
                break;
            }
            boolean[] book = new boolean[page + 1];
            Arrays.fill(book, false);
            StringTokenizer st1 = new StringTokenizer(br.readLine(), ",");
            StringTokenizer st2;
            while (st1.hasMoreTokens()) {
                String str = st1.nextToken();
                str = str.replace("-", " ");
                st2 = new StringTokenizer(str, " ");
                if (st2.countTokens() > 1) {
                    int start = Integer.parseInt(st2.nextToken());
                    int end = Integer.parseInt(st2.nextToken());

                    // start와 end 값이 유효한지 확인
                    if (start < 1) {
                        start = 1;
                    }
                    if (end > page) {
                        end = page;
                    }
                    if (start <= end) {
                        for (int i = start; i <= end; i++) {
                            book[i] = true;
                        }
                    }
                } else {
                    int start = Integer.parseInt(st2.nextToken());

                    // start 값이 유효한지 확인
                    if (start >= 1 && start <= page) {
                        book[start] = true;
                    }
                }
            }
            int count = 0;
            for (int i = 1; i < book.length; i++) {
                if (book[i]) {
                    count++;
                }
            }
            sb.append(count).append('\n');
        }
    }
}
