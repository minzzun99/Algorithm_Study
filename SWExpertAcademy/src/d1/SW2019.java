package d1;

import java.util.*;

public class SW2019 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 1;
        for (int i=0; i<=n; i++) {
            System.out.print(value + " ");
            value *= 2;
        }
    }
}
