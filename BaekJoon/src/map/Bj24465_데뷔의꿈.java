package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Bj24465_데뷔의꿈 {
    private static HashMap<String, Integer> Constellation = new HashMap<>();

    private static class Birth {
        int month;
        int day;

        public Birth(int month, int day) {
            this.month = month;
            this.day = day;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < 7; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int month = Integer.parseInt(st.nextToken());
            int day = Integer.parseInt(st.nextToken());
            String star = getConstellation(month, day);
            Constellation.put(star, Constellation.getOrDefault(star, 0) + 1);
        }

        int N = Integer.parseInt(br.readLine());
        List<Birth> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int month = Integer.parseInt(st.nextToken());
            int day = Integer.parseInt(st.nextToken());
            String star = getConstellation(month, day);
            if (Constellation.containsKey(star)) {
                continue;
            } else {
                list.add(new Birth(month, day));
            }
        }

        if (list.isEmpty()) {
            System.out.println("ALL FAILED");
        } else {
            list.sort((Birth o1, Birth o2) -> {
                if (o1.month == o2.month) {
                    return o1.day - o2.day;
                } else {
                    return o1.month - o2.month;
                }
            });

            for (Birth p : list) {
                sb.append(p.month).append(" ").append(p.day).append('\n');
            }
            System.out.println(sb);
        }
    }

    public static String getConstellation(int month, int day) {
        if (month == 1) {
            if (day < 20) {
                return "염소";
            } else {
                return "물병";
            }
        } else if (month == 2) {
            if (day < 19) {
                return "물병";
            } else {
                return "물고기";
            }
        } else if (month == 3) {
            if (day < 21) {
                return "물고기";
            } else {
                return "양";
            }
        } else if (month == 4) {
            if (day < 20) {
                return "양";
            } else {
                return "황소";
            }
        } else if (month == 5) {
            if (day < 21) {
                return "황소";
            } else {
                return "쌍둥이";
            }
        } else if (month == 6) {
            if (day < 22) {
                return "쌍둥이";
            } else {
                return "게";
            }
        } else if (month == 7) {
            if (day < 23) {
                return "게";
            } else {
                return "사자";
            }
        } else if (month == 8) {
            if (day < 23) {
                return "사자";
            } else {
                return "처녀";
            }
        } else if (month == 9) {
            if (day < 23) {
                return "처녀";
            } else {
                return "천칭";
            }
        } else if (month == 10) {
            if (day < 23) {
                return "천칭";
            } else {
                return "전갈";
            }
        } else if (month == 11) {
            if (day < 23) {
                return "전갈";
            } else {
                return "사수";
            }
        } else { // month == 12
            if (day < 22) {
                return "사수";
            } else {
                return "염소";
            }
        }
    }

}
