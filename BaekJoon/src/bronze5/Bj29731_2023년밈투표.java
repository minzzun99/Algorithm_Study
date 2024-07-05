package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Bj29731_2023년밈투표 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        set.add("Never gonna give you up");
        set.add("Never gonna let you down");
        set.add("Never gonna run around and desert you");
        set.add("Never gonna make you cry");
        set.add("Never gonna say goodbye");
        set.add("Never gonna tell a lie and hurt you");
        set.add("Never gonna stop");

        boolean flag = true;
        while (n-- > 0) {
            String str = br.readLine();
            if (!set.contains(str)) {
                flag = false;
                break;
            } else {
                continue;
            }
        }
        if (flag) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
