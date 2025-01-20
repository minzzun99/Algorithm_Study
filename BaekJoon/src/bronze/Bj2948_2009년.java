package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.StringTokenizer;

public class Bj2948_2009년 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int D = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        LocalDate dete = LocalDate.of(2009, M, D);
        DayOfWeek dayOfWeek = dete.getDayOfWeek();
        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US));
    }
}
