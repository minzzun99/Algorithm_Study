package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj3613_Java_vs_Cpp {
    private static StringBuilder sb;
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        String varName = br.readLine();
        String type = identityVarName(varName);
        if (type.equals("C++")) {
            System.out.println(convertToJava(varName));
        } else if (type.equals("Java")) {
            System.out.println(convertToCpp(varName));
        } else {
            System.out.println("Error!");
        }
    }

    private static String identityVarName(String str) {
        if (str.contains("_")) {
            if (isValidCpp(str)) {
                return "C++";
            } else {
                return "Error";
            }
        } else {
            if (isValidJava(str)) {
                return "Java";
            } else {
                return "Error";
            }
        }
    }

    private static boolean isValidCpp(String str) {
        if (str.startsWith("_") || str.endsWith("_") || str.contains("__")) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValidJava(String str) {
        if (str.contains("_")) {
            return false;
        }

        if (!Character.isLowerCase(str.charAt(0))) {
            return false;
        }

        return true;
    }

    private static String convertToJava(String str) {
        st = new StringTokenizer(str, "_");
        boolean first = true;
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            if (first) {
                sb.append(word);
                first = false;
            } else {
                sb.append((char)(word.charAt(0) - 32)).append(word.substring(1));
            }
        }

        return sb.toString();
    }

    private static String convertToCpp(String str) {
        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);
            if (now < 97) {
                sb.append('_').append((char)(now + 32));
            } else {
                sb.append(now);
            }
        }

        return sb.toString();
    }
}
