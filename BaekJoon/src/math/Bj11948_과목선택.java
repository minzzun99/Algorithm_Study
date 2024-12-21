package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bj11948_과목선택 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            arr1.add(Integer.parseInt(br.readLine()));
        }

        List<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            arr2.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr1, Collections.reverseOrder());
        Collections.sort(arr2, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += arr1.get(i);
        }
        sum += arr2.get(0);

        System.out.println(sum);
    }
}
