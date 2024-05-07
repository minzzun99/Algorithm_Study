package ch1_4;

public class JavaStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append("ABC");

        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.insert(1,2);
        System.out.println(sb);
        sb.insert(3,"KKK");
        System.out.println(sb);
    }
}
