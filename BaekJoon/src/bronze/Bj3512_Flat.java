package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj3512_Flat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int total = 0;
        int bedrooms = 0;
        int balconies = 0;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int size = Integer.parseInt(st.nextToken());
            String type = st.nextToken();
            if (type.equals("bedroom")) {
                bedrooms += size;
            } else if (type.equals("balcony")) {
                balconies += size;
            }

            total += size;
        }

        System.out.println(total);
        System.out.println(bedrooms);
        System.out.println(C * (total - ((double)balconies / 2)));
    }
}
