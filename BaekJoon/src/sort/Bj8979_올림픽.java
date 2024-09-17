package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj8979_올림픽 {
    private static int N, K;

    private static class Country {
        int number;
        int gold;
        int silver;
        int bronze;
        int rank;

        Country(int number, int gold, int silver, int bronze, int rank) {
            this.number = number;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
            this.rank = rank;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        List<Country> countryList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());

            countryList.add(new Country(num, gold, silver, bronze, 0));
        }

        Collections.sort(countryList, ((o1, o2) -> {
            if (o1.gold == o2.gold) {
                if (o1.silver == o2.silver) {
                    return o2.bronze - o1.bronze;
                } else {
                    return o2.silver - o1.silver;
                }
            } else {
                return o2.gold - o1.gold;
            }
        }));

        countryList.get(0).rank = 1;
        int indexK = 0;
        Country prevCountry = countryList.get(0);
        for (int i = 1; i < countryList.size(); i++) {
            Country now = countryList.get(i);
            if (now.number == K) {
                indexK = i;
            }

            if (now.gold == prevCountry.gold && now.silver == prevCountry.silver && now.bronze == prevCountry.bronze) {
                now.rank = prevCountry.rank;
            } else {
                now.rank = i + 1;
            }

            prevCountry = now;
        }

        System.out.println(countryList.get(indexK).rank);
    }
}
