package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj32278_선택가능성이가장높은자료형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long input = Long.parseLong(br.readLine());
        if (-32768 <= input && input <= 32767) {
            System.out.println("short");
        } else if (-2147483648 <= input && input <= 2147483647) {
            System.out.println("int");
        } else {
            System.out.println("long long");
        }
    }
}
