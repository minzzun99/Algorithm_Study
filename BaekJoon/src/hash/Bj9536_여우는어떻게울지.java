package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj9536_여우는어떻게울지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String crying = br.readLine();
            List<String> soundList = new ArrayList<>();
            st = new StringTokenizer(crying, " ");
            while (st.hasMoreTokens()) {
                soundList.add(st.nextToken());
            }

            while (true) {
                String sound = br.readLine();
                if (sound.equals("what does the fox say?")) {
                    break;
                }
                st = new StringTokenizer(sound, " ");
                st.nextToken();
                st.nextToken();
                String animalSound = st.nextToken();
                for (int i = 0; i < soundList.size(); i++) {
                    if (soundList.get(i).equals(animalSound)) {
                        soundList.remove(i);
                        i--;
                    }
                }
            }
            for (int i = 0; i < soundList.size(); i++) {
                sb.append(soundList.get(i)).append(" ");
            }
            System.out.println(sb);
            soundList.clear();
            sb.setLength(0);
        }
    }
}
