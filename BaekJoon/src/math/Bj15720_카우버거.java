package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj15720_카우버거 {
    private static int rawPrice;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        List<Integer> burgers = initPrice(B, br.readLine());
        List<Integer> drinks = initPrice(C, br.readLine());
        List<Integer> side = initPrice(D, br.readLine());

        int discountCount = Math.min(B, Math.min(C, D));
        int discountPrice = 0;
        while(true) {
            if(burgers.isEmpty() && side.isEmpty() && drinks.isEmpty()) break;
            int count = 0;
            int sum = 0;
            if(!burgers.isEmpty()) {
                int price = burgers.remove(0);
                sum += price;
                count++;
            }

            if(!drinks.isEmpty()) {
                int price = drinks.remove(0);
                sum += price;
                count++;
            }

            if(!side.isEmpty()) {
                int price = side.remove(0);
                sum += price;
                count++;
            }

            if(count == 3) {
                sum = (int) (sum * 0.9);
            }
            discountPrice += sum;
        }

        sb.append(rawPrice).append('\n').append(discountPrice);
        System.out.println(sb);
    }

    private static List<Integer> initPrice(int count, String input) {
        StringTokenizer st = new StringTokenizer(input, " ");
        List<Integer> price = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(st.nextToken());
            price.add(num);
            rawPrice += num;
        }
        Collections.sort(price, Collections.reverseOrder());

        return price;
    }
}
