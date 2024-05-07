package ch9_tree;

import java.util.Arrays;

public class Problem25 {
    public static String[] solution(int[] nodes) {
        String[] result = new String[3];    //전위, 중위, 후위
        result[0] = preorder(nodes, 0).trim();
        result[1] = inorder(nodes, 0).trim();
        result[2] = postorder(nodes, 0).trim();
        return result;
    }

    private static String preorder(int[] nodes, int idx) {
        if (idx >= nodes.length) {
            return "";
        }

        return nodes[idx] + " " +
                preorder(nodes, 2 * idx + 1) +
                preorder(nodes, 2 * idx + 2);

        // 1 + p(1) + p(2)
        // 1 + { 2 + p(3) + p(4) } + { 3 + p(5) + p(6) }
        // 1 2 4 5 3 6 7

    }

    private static String inorder(int[] nodes, int idx) {
        if (idx >= nodes.length) {
            return "";
        }

        return inorder(nodes, 2 * idx + 1) +
                nodes[idx] + " " +
                inorder(nodes, 2 * idx + 2);
        // idx = 0
        // p(1) + 1 + p(2)
        //p(3) + 2 + p(4) + 1 + p(5) + 3 + p(6)
        //4 2 5 1 6 3 7
    }

    private static String postorder(int[] nodes, int idx) {
        if (idx >= nodes.length) {
            return "";
        }

        return postorder(nodes, 2 * idx + 1) +
                postorder(nodes, 2 * idx + 2) +
                nodes[idx] + " ";

        //p(1) + p(2) + 1
        //{p(3) + p(4) + 2} + {p(5) + p(6) + 3} + 1
        // 4 5 2 6 7 3 1
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, 4, 5, 6, 7};
        Arrays.stream(solution(nodes)).forEach(System.out::println);
    }
}
