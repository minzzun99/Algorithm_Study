package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1244_스위켜고끄기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[count + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= count; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) {
                arr[i] = true;
            } else {
                arr[i] = false;
            }
        }

        int studentCount = Integer.parseInt(br.readLine());
        while (studentCount-- > 0) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            if (gender == 1) {
                changeBoyStudent(arr, number);
                continue;
            }
            changeGirlStudent(arr, number);
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }

            if (i % 20 == 0) {
                sb.append('\n');
            }
        }
        System.out.println(sb);
    }

    private static void changeBoyStudent(boolean[] arr, int number) {
        int index = number;
        while (index < arr.length) {
            arr[index] = !arr[index];
            index += number;
        }
    }

    private static void changeGirlStudent(boolean[] arr, int number) {
        int left = number - 1;
        int right = number + 1;
        arr[number] = !arr[number];

        while (left >= 1 && right < arr.length) {
            if (arr[left] != arr[right]) {
                break;
            }
            arr[left] = !arr[left];
            arr[right] = !arr[right];
            left--;
            right++;
        }
    }
}
