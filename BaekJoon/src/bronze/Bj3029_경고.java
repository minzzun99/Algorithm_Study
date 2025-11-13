package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Bj3029_경고 {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("GMT"));
        String a = br.readLine();
        String b = br.readLine();
        Date dateA = format.parse(a);
        Date dateB = format.parse(b);

        long time = dateB.getTime() - dateA.getTime();
        if (time == 0) {
            System.out.println("24:00:00");
        } else {
            System.out.println(format.format(time));
        }
    }
}
