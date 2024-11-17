package ssafy13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class SWEA1221_GNS {
    private static Map<String, Integer> stringIntegerMap;
    private static Map<Integer, String> integerStringMap;
    private static List<String> input;
    private static List<Integer> numberList;
    private static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        initMap();
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            String tc = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            input = new ArrayList<>();
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < num; i++) {
                input.add(st.nextToken());
            }

            numberList = new ArrayList<>();
            for (String string : input) {
                numberList.add(stringIntegerMap.get(string));
            }

            Collections.sort(numberList);
            sb.append(tc).append(' ').append(getResult()).append('\n');
        }

        System.out.println(sb);
    }

    private static String getResult() {
        StringBuilder result = new StringBuilder();
        for (int i : numberList) {
            result.append(integerStringMap.get(i)).append(' ');
        }

        return result.toString();
    }

    private static void initMap() {
        stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("ZRO", 0);
        stringIntegerMap.put("ONE", 1);
        stringIntegerMap.put("TWO", 2);
        stringIntegerMap.put("THR", 3);
        stringIntegerMap.put("FOR", 4);
        stringIntegerMap.put("FIV", 5);
        stringIntegerMap.put("SIX", 6);
        stringIntegerMap.put("SVN", 7);
        stringIntegerMap.put("EGT", 8);
        stringIntegerMap.put("NIN", 9);

        integerStringMap = new HashMap<>();
        integerStringMap.put(0, "ZRO");
        integerStringMap.put(1, "ONE");
        integerStringMap.put(2, "TWO");
        integerStringMap.put(3, "THR");
        integerStringMap.put(4, "FOR");
        integerStringMap.put(5, "FIV");
        integerStringMap.put(6, "SIX");
        integerStringMap.put(7, "SVN");
        integerStringMap.put(8, "EGT");
        integerStringMap.put(9, "NIN");
    }
}
