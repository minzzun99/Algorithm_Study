package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj28249_ChiliPeppers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        while (N-- > 0){
            String input = br.readLine();
            if(input.equals("Poblano")) {
                sum += 1500;
            }else if(input.equals("Mirasol")) {
                sum += 6000;
            }else if(input.equals("Serrano")) {
                sum += 15500;
            }else if(input.equals("Cayenne")) {
                sum += 40000;
            }else if(input.equals("Thai")) {
                sum += 75000;
            }else if(input.equals("Habanero")) {
                sum += 125000;
            }
        }

        System.out.println(sum);
    }
}
