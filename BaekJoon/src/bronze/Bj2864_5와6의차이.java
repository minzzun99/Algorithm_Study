package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2864_5와6의차이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        System.out.println(getMin(A, B) + " " + getMax(A, B));
    }

    private static int getMin(String A, String B) {
        A = A.replaceAll("6", "5");
        B = B.replaceAll("6", "5");
        return Integer.parseInt(A) + Integer.parseInt(B);
    }

    private static int getMax(String A, String B) {
        A = A.replaceAll("5", "6");
        B = B.replaceAll("5", "6");
        return Integer.parseInt(A) + Integer.parseInt(B);
    }
}
