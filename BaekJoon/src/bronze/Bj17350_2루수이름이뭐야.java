    package bronze;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.List;

    public class Bj17350_2루수이름이뭐야 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            List<String> names = new ArrayList<>();

            while (N-- > 0) {
                names.add(br.readLine());
            }

            if (names.contains("anj")) {
                System.out.println("뭐야;");
                return;
            }
            System.out.println("뭐야?");
        }
    }
