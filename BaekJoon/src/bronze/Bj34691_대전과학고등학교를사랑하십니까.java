package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Bj34691_대전과학고등학교를사랑하십니까 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, String> result = Map.of(
                "animal", "Panthera tigris",
                "flower", "Forsythia koreana",
                "tree", "Pinus densiflora"
        );

        while (true) {
            String input = br.readLine();
            if (input.equals("end")) {
                break;
            }
            sb.append(result.get(input)).append('\n');
        }
        System.out.println(sb);
    }
}
