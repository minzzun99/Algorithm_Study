package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PGS12931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            answer += c - '0';
        }

        return answer;
    }
}
