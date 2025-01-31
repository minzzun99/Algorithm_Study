package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj32154_SUAPC2024Winter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        switch (N) {
            case 1:
                System.out.println("11\n"
                        + "A B C D E F G H J L M");
                break;
            case 2:
                System.out.println("9\n"
                        + "A C E F G H I L M");
                break;
            case 3:
                System.out.println("9\n"
                        + "A C E F G H I L M");
                break;
            case 4:
                System.out.println("9\n"
                        + "A B C E F G H L M");
                break;
            case 5:
                System.out.println("8\n"
                        + "A C E F G H L M");
                break;
            case 6:
                System.out.println("8\n"
                        + "A C E F G H L M");
                break;
            case 7:
                System.out.println("8\n"
                        + "A C E F G H L M");
                break;
            case 8:
                System.out.println("8\n"
                        + "A C E F G H L M");
                break;
            case 9:
                System.out.println("8\n"
                        + "A C E F G H L M");
                break;
            case 10:
                System.out.println("8\n"
                        + "A B C F G H L M");
                break;
        }
    }
}
