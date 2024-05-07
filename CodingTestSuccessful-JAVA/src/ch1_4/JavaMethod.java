package ch1_4;

public class JavaMethod {
    public static void main(String[] args) {
        int ret = add(5,10);
        System.out.println(ret);
    }
    public static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}
