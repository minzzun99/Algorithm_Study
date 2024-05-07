import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg12925 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
    public static int solution(String s) {
        StringBuilder sb = new StringBuilder();
        if(s.charAt(0) == '+') {
            for(int i = 1; i < s.length(); i++) {
                sb.append(s.charAt(i));
            }
        }else if(s.charAt(0) == '-') {
            sb.append('-');
            for(int i = 1; i < s.length(); i++) {
                sb.append(s.charAt(i));
            }
        }else {
            for(int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(i));
            }
        }

        return Integer.parseInt(sb.toString());
    }
}
