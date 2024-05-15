package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Bj2309_일곱난쟁이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] heightArr = new int[9];
        int sum = 0;
        for(int i = 0; i < 9; i++) {
            heightArr[i] = Integer.parseInt(br.readLine());
            sum += heightArr[i];
        }
        Arrays.sort(heightArr);

        int except1 = 0;
        int except2 = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if(sum - heightArr[i] - heightArr[j] == 100) {
                    except1=i;
                    except2=j;
                    break;
                }
            }
        }

        for (int i = 0; i < heightArr.length; i++) {
            if (i != except1 && i != except2) {
                sb.append(heightArr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}
