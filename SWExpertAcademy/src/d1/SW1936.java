package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1936 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        if((A == 1 && B == 2) || (A == 2 && B ==3) || (A == 3 && B == 1)){
            sb.append("B");
        }else {
            sb.append("A");
        }
        System.out.println(sb);
    }
}

//가위는 1, 바위는 2, 보는 3