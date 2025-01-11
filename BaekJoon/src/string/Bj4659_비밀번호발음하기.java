package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4659_비밀번호발음하기 {
    private static final String ACCEPTABLE_FORMAT = "<%s> is acceptable.\n";
    private static final String NOT_ACCEPTABLE_FORMAT = "<%s> is not acceptable.\n";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if (str.equals("end")) {
                break;
            }
            if (checkString(str)) {
                sb.append(String.format(ACCEPTABLE_FORMAT, str));
                continue;
            }
            sb.append(String.format(NOT_ACCEPTABLE_FORMAT, str));
        }

        System.out.println(sb);
    }

    private static boolean checkString(String str) {
        return checkVowel(str) && !checkThreeCount(str) && !checkSameCharacter(str);
    }

    private static boolean checkVowel(String str) {
        return str.matches(".*[aeiou].*");
    }

    private static boolean checkThreeCount(String str) {
        int count = 1;
        boolean prev = checkVowel(String.valueOf(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            boolean current = checkVowel(String.valueOf(str.charAt(i)));
            if (current == prev) {
                count++;
                if (count > 2) {
                    return true;
                }
            } else {
                count = 1;
            }
            prev = current;
        }

        return false;
    }

    private static boolean checkSameCharacter(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1) && !(str.charAt(i) == 'e' || str.charAt(i) == 'o')) {
                return true;
            }
        }
        return false;
    }
}
