package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj1431_시리얼번호 {
    private static class SerialNum{
        String serial;
        int sum;
        public SerialNum(String serial, int sum){
            this.serial = serial;
            this.sum = sum;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        SerialNum[] arr = new SerialNum[N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                if (Character.isDigit(str.charAt(j))) {
                    sum += Character.getNumericValue(str.charAt(j));
                }
            }
            arr[i] = new SerialNum(str, sum);
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1.serial.length() != o2.serial.length()) {
                return Integer.compare(o1.serial.length(), o2.serial.length());
            } else {
                if (o1.sum != o2.sum) {
                    return Integer.compare(o1.sum, o2.sum);
                } else {
                    return o1.serial.compareTo(o2.serial);
                }
            }
        });

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i].serial).append('\n');
        }
        System.out.println(sb);
    }
}
