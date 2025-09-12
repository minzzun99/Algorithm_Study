package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj18198_Basketball_OneonOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int scoreA = 0, scoreB = 0;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == 'A'){
                scoreA += input.charAt(i + 1) - 48;
            } else if(input.charAt(i) == 'B'){
                scoreB += input.charAt(i + 1) - 48;
            }
        }

        if(scoreA > scoreB){
            System.out.println("A");
        } else if(scoreB > scoreA){
            System.out.println("B");
        }
    }
}
