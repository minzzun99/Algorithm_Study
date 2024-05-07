package ch13_sort;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        Arrays.sort(phone_book);
        for (String s : phone_book) {
            System.out.println(s);
        }
    }
}
