package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj31994_강당대관 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String maxRoomName = "";
        int maxCount = 0;
        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String roomName = st.nextToken();
            int count = Integer.parseInt(st.nextToken());

            if (maxCount < count) {
                maxCount = count;
                maxRoomName = roomName;
            }
        }

        System.out.println(maxRoomName);
    }
}
