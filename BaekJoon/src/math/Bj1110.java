package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Bj1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(N < 10) {
            arrayList.add(0);
            arrayList.add(N);
        } else {
            arrayList.add(N / 10);
            arrayList.add(N % 10);
        }
        while (true) {
            int addNum = (arrayList.get(arrayList.size() - 2)) + (arrayList.get(arrayList.size() - 1));
            if(addNum >= 10) {
                addNum %= 10;
            }
            arrayList.add(addNum);
            if (N == (arrayList.get(arrayList.size() - 2) * 10) + arrayList.get(arrayList.size() - 1)) {
                break;
            }
        }
        System.out.println(arrayList.size()-2);
    }
}
