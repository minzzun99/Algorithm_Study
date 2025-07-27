package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj20232_Archivist {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N == 1995 || 1998 <= N && N <= 1999 || 2001 <= N && N <= 2005 || 2009 <= N && N <= 2012 || 2014 <= N && N <= 2017 || N == 2019) {
            System.out.println("ITMO");
        }else if(N == 1996 || N == 1997 || N == 2000 || 2007 <= N && N <= 2008 || N == 2013 || N == 2018) {
            System.out.println("SPbSU");
        }else if(N == 2006) {
            System.out.println("PetrSU, ITMO");
        }
    }
}
