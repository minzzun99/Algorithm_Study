package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj25757_임스와함께하는미니게임 {
    private static Map<Character, Integer> gameMap;
    private static Set<String> player;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        char game = st.nextToken().charAt(0);
        gameMap = new HashMap<>();
        player = new HashSet<>();
        setGameMap();
        for (int i = 0; i < N; i++) {
            player.add(br.readLine());
        }

        System.out.println(player.size() / (gameMap.get(game) - 1));
    }

    private static void setGameMap() {
        gameMap.put('Y', 2);
        gameMap.put('F', 3);
        gameMap.put('O', 4);
    }
}
