package ch1_4;

import java.util.Arrays;
import java.util.Comparator;

public class JavaLambda {
    int dest, cost;
    public JavaLambda(int dest, int cost) {
        this.dest = dest;
        this.cost = cost;
    }

    public static void main(String[] args) {
        JavaLambda[] nodes = new JavaLambda[5];
        nodes[0] = new JavaLambda(1, 10);
        nodes[1] = new JavaLambda(2, 20);
        nodes[2] = new JavaLambda(3, 15);
        nodes[3] = new JavaLambda(4, 5);
        nodes[4] = new JavaLambda(1, 25);
        Arrays.sort(nodes, (o1, o2) -> Integer.compare(o1.cost, o2.cost));

        Arrays.sort(nodes, new Comparator<JavaLambda>() {
            @Override
            public int compare(JavaLambda o1, JavaLambda o2) {
                return Integer.compare(o1.cost, o2.cost);
            }
        });
    }
}
