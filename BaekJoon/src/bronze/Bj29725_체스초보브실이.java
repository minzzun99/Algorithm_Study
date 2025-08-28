package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj29725_체스초보브실이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for(int i=0; i<8; i++){
            String line = br.readLine();
            for (int j = 0; j < 8; j++) {
                char c = line.charAt(j);
                switch (c) {
                    case '.':
                        break;
                    case 'K':
                        count += 0;
                        break;
                    case 'P':
                        count += 1;
                        break;
                    case 'N':
                        count += 3;
                        break;
                    case 'B':
                        count += 3;
                        break;
                    case 'R':
                        count += 5;
                        break;
                    case 'Q':
                        count += 9;
                        break;
                    case 'k':
                        count += 0;
                        break;
                    case 'p':
                        count -= 1;
                        break;
                    case 'n':
                        count -= 3;
                        break;
                    case 'b':
                        count -= 3;
                        break;
                    case 'r':
                        count -= 5;
                        break;
                    case 'q':
                        count -= 9;
                        break;
                }
            }
        }
        System.out.println(count);
    }
}
