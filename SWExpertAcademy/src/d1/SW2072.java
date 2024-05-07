package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW2072 {
    /*public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            int sum = 0;
            for(int i = 0; i < 10; i++) {
                int a = sc.nextInt();
                if(a % 2 == 1) {
                    sum += a;
                }
            }
            sb.append("#").append(test_case).append(" ").append(sum).append('\n');
        }
        System.out.print(sb);
    }*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= t; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int sum = 0;
            for(int i = 0; i < 10; i++) {
                int a = Integer.parseInt(st.nextToken());
                if(a % 2 == 1) {
                    sum += a;
                }
            }
            sb.append("#").append(test_case).append(" ").append(sum).append('\n');
        }
        System.out.print(sb);
    }
}

