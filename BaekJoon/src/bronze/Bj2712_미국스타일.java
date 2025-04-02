package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2712_미국스타일 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            double d = Double.parseDouble(st.nextToken());
            String type = st.nextToken();
            if (type.equals("kg")) {
                sb.append(String.format("%.04f lb\n", d * 2.2046));
            } else if (type.equals("g")) {
                sb.append(String.format("%.04f l\n", d * 3.7854));
            } else if (type.equals("l")) {
                sb.append(String.format("%.04f g\n", d * 0.2642));
            } else {
                sb.append(String.format("%.04f kg\n", d * 0.4536));
            }
        }
        System.out.println(sb);
    }
}
