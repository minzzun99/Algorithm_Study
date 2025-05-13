package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5613_계산기프로그램 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        while (true) {
            String input = br.readLine();
            if (input.equals("=")) {
                break;
            }

            int num = Integer.parseInt(br.readLine());
            if(input.equals("+")) {
                sum += num;
            }else if(input.equals("-")){
                sum -= num;
            }else if(input.equals("*")){
                sum *= num;
            }else{
                sum /= num;
            }
        }

        System.out.println(sum);
    }
}
