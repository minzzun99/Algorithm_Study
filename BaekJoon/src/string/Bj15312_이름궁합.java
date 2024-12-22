package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bj15312_이름궁합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        String A = br.readLine();
        String B = br.readLine();

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            char aChar = A.charAt(i);
            char bChar = B.charAt(i);

            result.add(arr[aChar - 'A']);
            result.add(arr[bChar - 'A']);
        }

        List<Integer> temp;
        while (result.size() > 2) {
            temp = new ArrayList<>();
            for (int i = 0; i < result.size() - 1; i++) {
                temp.add((result.get(i) + result.get(i + 1)) % 10);
            }

            result = new ArrayList<>(temp);
        }
        System.out.println(result.get(0) + "" + result.get(1));
    }
}
