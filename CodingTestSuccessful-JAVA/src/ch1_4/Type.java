package ch1_4;

import java.util.*;

public class Type {
    public static void main(String[] args) {
        //프리미티브 타입 사용법
        int i = 0;
        long[] longs = new long[10];
        float f = 10.5f;
        double d = 10 / 3.0;

        //레퍼런스 타입 사용법 (꼭 필요한 경우가 아니면 권장하지 않음)
        Integer I = 0;
        Long[] Longs = new Long[10];
        Float F = 10.5f;
        Double D = 10 / 3.0;

        //문법 오류 발생
        /*ArrayList<int> arrayList = new ArrayList<>();
        Stack<long> stack = new Stack<>();
        Queue<float> queue = new Queue<>();
        ArrayDeque<double> arrayDeque = new ArrayDeque<>();*/

        //올바른 코드
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Long> stack = new Stack<>();
        Queue<Float> queue = new ArrayDeque<>();
        ArrayDeque<Double> arrayDeque = new ArrayDeque<>();
    }
}
