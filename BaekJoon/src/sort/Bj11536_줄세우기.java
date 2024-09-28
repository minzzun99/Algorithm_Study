package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj11536_줄세우기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder name = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] nameArr = new String[N];
        for (int i = 0; i < N; i++) {
            nameArr[i] = br.readLine();
            name.append(nameArr[i]);
        }

        String[] increasingArr = nameArr.clone();
        String[] decreasingArr = nameArr.clone();

        Arrays.sort(increasingArr, String::compareTo);
        Arrays.sort(decreasingArr, (o1, o2) -> o2.compareTo(o1));

        StringBuilder increasing = new StringBuilder();
        StringBuilder decreasing = new StringBuilder();

        for (int i = 0; i < N; i++) {
            increasing.append(increasingArr[i]);
            decreasing.append(decreasingArr[i]);
        }

        if (name.toString().equals(increasing.toString())) {
            System.out.println("INCREASING");
        } else if (name.toString().equals(decreasing.toString())) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }
    }
}
