package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj17598_AnimalKingElection {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lion = 0;
        int tiger = 0;
        for (int i = 0; i < 9; i++) {
            if (br.readLine().equals("Lion")) {
                lion++;
            } else {
                tiger++;
            }
        }

        if (lion > tiger) {
            System.out.println("Lion");
        } else {
            System.out.println("Tiger");
        }
    }
}
