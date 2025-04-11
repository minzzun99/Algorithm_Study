package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj6778_WhichAlien {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        if (N >= 3 && M <= 4) {
            System.out.println("TroyMartian");
        }
        if(N <= 6 && M >= 2 ){
            System.out.println("VladSaturnian");
        }
        if(N <= 2 && M <= 3){
            System.out.println("GraemeMercurian");
        }
    }
}
