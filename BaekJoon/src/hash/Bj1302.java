package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> bookMap = new HashMap<>();
        int max = 0;
        while (N-- > 0) {
            String bookName = br.readLine();
            bookMap.put(bookName, bookMap.getOrDefault(bookName, 1) + 1);
            max = Math.max(max, bookMap.get(bookName));
        }
        ArrayList<String> bookList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : bookMap.entrySet()) {
            if (entry.getValue() == max) {
                bookList.add(entry.getKey());
            }
        }
        Collections.sort(bookList);
        System.out.println(bookList.get(0));
    }
}
