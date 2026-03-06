package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj16431_베시와데이지 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int Br = Integer.parseInt(st.nextToken());
        int Bc = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(reader.readLine());
        int Dr = Integer.parseInt(st.nextToken());
        int Dc = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(reader.readLine());
        int Jr = Integer.parseInt(st.nextToken());
        int Jc = Integer.parseInt(st.nextToken());

        int Bmove = Math.max((Math.abs(Br - Jr)), (Math.abs(Bc - Jc)));
        int Dmove = Math.abs(Dr - Jr) + Math.abs(Dc - Jc);

        if(Bmove < Dmove) {
            System.out.println("bessie");
        }else if(Bmove > Dmove) {
            System.out.println("daisy");
        }else {
            System.out.println("tie");
        }
    }
}
