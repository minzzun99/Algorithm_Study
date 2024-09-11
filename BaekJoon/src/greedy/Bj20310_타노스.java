package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Bj20310_타노스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int zero = 0;
        int one = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                zero++;
            } else {
                one++;
            }
        }

        zero /= 2;
        one /= 2;
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (count == one) {
                break;
            }
            if(str.charAt(i) == '1'){
                result.add(i);
                count++;
            }
        }
        count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (count == zero) {
                break;
            }
            if(str.charAt(i) == '0'){
                result.add(i);
                count++;
            }
        }
        Collections.sort(result);

        int index = 0;
        for(int i = 0; i < str.length(); i++){
            if(index == result.size()){
                sb.append(str.charAt(i));
                continue;
            }
            int now = result.get(index);
            if(now == i) {
                index++;
                continue;
            }
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}