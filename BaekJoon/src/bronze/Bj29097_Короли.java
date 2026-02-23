package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj29097_Короли {
    private static class Army {
        private String name;
        private int power;

        private Army(String name, int x, int y) {
            this.name = name;
            this.power = x * y;
        }

        private String getName() {
            return name;
        }

        private int getPower() {
            return power;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        Army joffey = new Army("Joffrey", n, a);
        Army robb = new Army("Robb", m, b);
        Army stannis = new Army("Stannis", k, c);

        List<Army> armies = List.of(joffey, robb, stannis);
        int maxPower = Math.max(joffey.getPower(), Math.max(robb.getPower(), stannis.getPower()));

        List<String> result = new ArrayList<>();
        for (Army army : armies) {
            if (army.getPower() == maxPower) {
                result.add(army.getName());
            }
        }

        Collections.sort(result);
        result.forEach(name -> System.out.print(name + " "));
    }
}
