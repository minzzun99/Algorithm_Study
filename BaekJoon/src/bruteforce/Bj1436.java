package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 1;

        while (count != N) {
            num++;
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }

    //N번째로 작은 종말의 수
    //666 1666 2666 3666 4666 5666 6660 6661 6662 6663 6664 6665 6666 6667 6668 6669 7666 8666 9666 10666
}
