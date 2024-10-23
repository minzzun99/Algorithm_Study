package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj1202_보석도둑 {
    private static int N, K;
    private static Jewel[] jewels;
    private static int[] bags;

    private static class Jewel {
        int weight;
        int price;

        Jewel(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        jewels = new Jewel[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int M = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            jewels[i] = new Jewel(M, V);
        }
        Arrays.sort(jewels, (o1, o2) -> {
            if (o1.weight == o2.weight) {
                return o2.price - o1.price;
            } else {
                return o1.weight - o2.weight;
            }
        });


        bags = new int[K];
        for (int i = 0; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(bags);

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            return o2 - o1;
        });

        long max = 0;
        int index = 0;
        for (int i = 0; i < K; i++) {
            while (index < N && jewels[index].weight <= bags[i]) {
                pq.add(jewels[index].price);
                index++;
            }

            if (!pq.isEmpty()) {
                max += pq.poll();
            }
        }

        System.out.println(max);
    }
}
