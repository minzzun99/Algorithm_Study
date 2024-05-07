package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj1406_2 {
    public static void main(String[] args) throws IOException {
        Stack stL = new Stack<>();
        Stack stR = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            stL.push(str.charAt(i));
        }

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String com = br.readLine();
            if (com.equals("L")) {
                if (!stL.empty()) {
                    stR.push(stL.pop());
                }
            } else if (com.equals("D")) {
                if (!stR.empty()) {
                    stL.push(stR.pop());

                }
            } else if (com.equals("B")) {
                if (!stL.empty()) {
                    stL.pop();
                }
            } else if (com.contains("P")) {
                char c = com.charAt(2);
                stL.push(c);
            }
        }

        while (!stL.empty()) {
            stR.push(stL.pop());
        }

        while (!stR.empty()) {
            System.out.print(stR.pop());
        }
    }
}
