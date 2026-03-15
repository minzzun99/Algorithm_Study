package bronze;

import java.util.Scanner;

public class Bj30143_CookiePiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int d = sc.nextInt();

            for (int j = 0; j < n; j++) {
                sum += a + d * j;
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
