package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bj1644_소수의연속합 {
    private static List<Integer> primeNumber;
    private static boolean[] isPrime;
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        primeNumber = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        isPrime = new boolean[N + 1];

        findPrime(N);

        int start = 0;
        int end = 0;
        int sum = 0;
        while (true) {
            if (sum >= N) {
                if (sum == N) {
                    count++;
                }
                sum -= primeNumber.get(start++);
            } else {
                if (end == primeNumber.size()) {
                    break;
                }
                sum += primeNumber.get(end++);
            }
        }

        System.out.println(count);
    }

    private static void findPrime(int number) {
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= number; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        addPrimeNumber(number);
    }

    private static void addPrimeNumber(int number) {
        for (int i = 2; i <= number; i++) {
            if (isPrime[i]) {
                primeNumber.add(i);
            }
        }
    }
}
