package ch1_4;

public class JavaString {
    public static void main(String[] args) {
        String str = "Hello, World!!";
        String str2 = "He";
        str2 += "llo";
        System.out.println(str);
        System.out.println(str2);

        str = str.replace("l", "");
        System.out.println(str);

        long start = System.currentTimeMillis();
        String s = "";
        for(int i=1; i<=100000; i++) {
            s+=i;
        }
        long end = System.currentTimeMillis();
        System.out.println(((end-start) / 1000.0) + "초");

        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=100000; i++) {
            sb.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println(((end2-start2) / 1000.0) + "초");
    }
}
