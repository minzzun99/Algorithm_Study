package d1;

import java.util.Scanner;

public class SW2043
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt(); //비밀번호
        int K = sc.nextInt(); //조회 시작번호

        //K도 확인대상이므로 +1
        if(P>K)
            System.out.println(P-K+1);
        else if(P<K)
            System.out.println(999-K+P+1);
        else
            System.out.println(1);
    }
}
