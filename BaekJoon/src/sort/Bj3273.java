package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj3273 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int X = Integer.parseInt(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int result = sum(N, X);
        System.out.println(result);
    }

    public static int sum(int N, int X) {
        int start = 0;		//Strat 포인터
        int end = N-1;		//End 포인터
        int count = 0;		//Count
        while(start<end) {
            int temp = arr[start] + arr[end];
            if(temp > X)	//규칙 1.
                end--;
            else {		//규칙 2, 3
                if(temp == X)		//규칙 2에 Count + 1
                    count++;
                start++;
            }
        }
        return count;	//Count 결과로 반환
    }
}