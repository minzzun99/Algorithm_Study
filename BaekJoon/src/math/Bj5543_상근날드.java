package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5543_상근날드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int burgerMin = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int burger = Integer.parseInt(br.readLine());
            burgerMin = Math.min(burgerMin, burger);
        }
        int drinkMin = Integer.MAX_VALUE;
        for (int i = 0; i < 2; i++) {
            int drink = Integer.parseInt(br.readLine());
            drinkMin = Math.min(drinkMin, drink);
        }
        System.out.println(burgerMin + drinkMin - 50);
    }
}
