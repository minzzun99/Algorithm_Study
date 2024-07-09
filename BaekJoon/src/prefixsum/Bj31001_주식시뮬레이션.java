package prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj31001_주식시뮬레이션 {
    static StringBuilder sb = new StringBuilder();
    static int N, M, Q;
    static Map<String, Long> accountMap = new HashMap<>();
    static Map<String, Long> stockMarket = new HashMap<>();
    static ArrayList<String>[] stockGroup;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());       // 상장한 회사의 개수
        M = Integer.parseInt(st.nextToken());       // 보유 현금
        Q = Integer.parseInt(st.nextToken());       // 메뉴 입력 개수

        // 계좌 초기값
        accountMap.put("Cash", (long) M);

        // 그룹
        stockGroup = new ArrayList[N + 1];
        for (int i = 1; i < N + 1; i++) {
            stockGroup[i] = new ArrayList<>();
        }
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int G = Integer.parseInt(st.nextToken());       // 그룹
            String H = st.nextToken();      // 회사 이름
            long P = Long.parseLong(st.nextToken());       // 가격
            stockGroup[G].add(H);       // 그룹에 저장
            stockMarket.put(H, P);      // 주식장 map에 저장
            accountMap.put(H, 0L);
        }

        while (Q-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int menu = Integer.parseInt(st.nextToken());
            if (menu == 1) {
                String company = st.nextToken();
                long count = Long.parseLong(st.nextToken());
                buyStock(company, count);
            } else if (menu == 2) {
                String company = st.nextToken();
                long count = Long.parseLong(st.nextToken());
                sellStock(company, count);
            } else if (menu == 3) {
                String company = st.nextToken();
                long cost = Long.parseLong(st.nextToken());
                stockPrice(company, cost);
            } else if (menu == 4) {
                int groupNum = Integer.parseInt(st.nextToken());
                long cost = Long.parseLong(st.nextToken());
                groupPrice(groupNum, cost);
            } else if (menu == 5) {
                int groupNum = Integer.parseInt(st.nextToken());
                long percent = Long.parseLong(st.nextToken());
                groupPricePercent(groupNum, percent);
            } else if (menu == 6) {
                printCash();
            } else if (menu == 7) {
                printTotal();
            } else {
                continue;
            }
        }

        System.out.println(sb);
    }

    private static void buyStock(String company, long count) {
        Long cash = accountMap.get("Cash");
        Long stockPrice = stockMarket.get(company);

        if (cash == null || stockPrice == null) {
            return; // 예외 방지: 필요한 값이 null인 경우 리턴
        }

        long totalPrice = stockPrice * count;
        if (cash < totalPrice) {
            return;
        }

        accountMap.put(company, accountMap.getOrDefault(company, 0L) + count);
        accountMap.put("Cash", cash - totalPrice);
    }

    private static void sellStock(String company, long count) {
        Long nowStock = accountMap.get(company);
        Long stockPrice = stockMarket.get(company);

        if (nowStock == null || stockPrice == null || nowStock == 0) {
            return; // 예외 방지: 필요한 값이 null이거나 보유 주식이 없는 경우 리턴
        }

        if (count > nowStock) {
            long price = nowStock * stockPrice;
            accountMap.put("Cash", accountMap.getOrDefault("Cash", 0L) + price);
            accountMap.put(company, 0L);
        } else {
            long price = count * stockPrice;
            accountMap.put("Cash", accountMap.getOrDefault("Cash", 0L) + price);
            accountMap.put(company, nowStock - count);
        }
    }

    private static void stockPrice(String company, long cost) {
        Long currentPrice = stockMarket.get(company);

        if (currentPrice == null) {
            return; // 예외 방지: 현재 가격이 null인 경우 리턴
        }

        long newPrice = currentPrice + cost;
        newPrice = (newPrice / 10) * 10; // 10원 단위로 맞춤
        stockMarket.put(company, newPrice);
    }

    private static void groupPrice(int groupNum, long cost) {
        if (groupNum < 1 || groupNum >= stockGroup.length) {
            return; // 예외 방지: 유효하지 않은 그룹 번호인 경우 리턴
        }

        for (String company : stockGroup[groupNum]) {
            Long currentPrice = stockMarket.get(company);
            if (currentPrice != null) {
                long newPrice = currentPrice + cost;
                newPrice = (newPrice / 10) * 10; // 10원 단위로 맞춤
                stockMarket.put(company, newPrice);
            }
        }
    }

    private static void groupPricePercent(int groupNum, long percent) {
        if (groupNum < 1 || groupNum >= stockGroup.length) {
            return; // 예외 방지: 유효하지 않은 그룹 번호인 경우 리턴
        }

        for (String company : stockGroup[groupNum]) {
            Long currentPrice = stockMarket.get(company);
            if (currentPrice != null) {
                long updatePrice = currentPrice * (100 + percent) / 100;
                updatePrice = (updatePrice / 10) * 10; // 10원 단위로 맞춤
                stockMarket.put(company, updatePrice);
            }
        }
    }

    private static void printCash() {
        Long cash = accountMap.get("Cash");
        if (cash != null) {
            sb.append(cash).append('\n');
        }
    }

    private static void printTotal() {
        long total = 0;
        for (Map.Entry<String, Long> entry : accountMap.entrySet()) {
            String key = entry.getKey();
            Long value = entry.getValue();
            if (value == null) {
                continue; // 예외 방지: 값이 null인 경우 건너뜀
            }
            if (key.equals("Cash")) {
                total += value;
            } else {
                Long stockPrice = stockMarket.get(key);
                if (stockPrice != null) {
                    total += stockPrice * value;
                }
            }
        }
        sb.append(total).append('\n');
    }
}
