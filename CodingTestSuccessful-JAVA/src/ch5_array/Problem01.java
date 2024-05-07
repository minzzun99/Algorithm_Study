package ch5_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[st.countTokens()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(solution(arr)));

    }
    private static int[] solution(int[] arr) {
        /*
        Arrays.sort(arr);
        return arr;*/

        //원본 배열을 그대로 두고 배열을 복사해서 복사한 배열을 리턴하는 법
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }
}
