package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj11121_CommunicationChannels {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            String output = st.nextToken();

            if (input.equals(output)) {
                System.out.println("OK");
            } else {
                System.out.println("ERROR");
            }
        }
    }
}
