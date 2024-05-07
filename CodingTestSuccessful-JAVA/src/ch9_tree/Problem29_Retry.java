package ch9_tree;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem29_Retry {
    public static class Node {
        int x, y, num;
        Node left;
        Node right;

        public Node(int num, int x, int y) {
            this.num = num;
            this.x = x;
            this.y = y;
        }
    }

    private static Node makeBT(int[][] nodeinfo) {
        Node[] nodes = new Node[nodeinfo.length];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new Node(i + 1, nodeinfo[i][0], nodeinfo[i][1]);
        }
        Arrays.sort(nodes, (o1, o2) -> {
            if (o1.y == o2.y) {
                return Integer.compare(o1.x, o2.x);
            }
            return Integer.compare(o2.y, o1.y);
        });

        Node root = nodes[0];
        for (int i = 1; i < nodes.length; i++) {
            Node parent = root;
            while (true) {
                if (nodes[i].x < parent.x) {
                    if (parent.left == null) {
                        parent.left = nodes[i];
                        break;
                    } else {
                        parent = parent.left;
                    }
                } else {
                    if (parent.right == null) {
                        parent.right = nodes[i];
                        break;
                    } else {
                        parent = parent.right;
                    }
                }
            }
        }
        return nodes[0];
    }

    public int[][] solution(int[][] nodeinfo) {
        Node root = makeBT(nodeinfo);
        ArrayList<Integer> preOrderList = new ArrayList<>();
        preOrder(root, preOrderList);
        ArrayList<Integer> postOrderList = new ArrayList<>();
        postOrder(root, postOrderList);

        int[][] answer = new int[2][nodeinfo.length];
        answer[0] = preOrderList.stream().mapToInt(Integer::intValue).toArray();
        answer[1] = postOrderList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    private static void preOrder(Node curr, ArrayList<Integer> list) {
        if (curr == null) {
            return;
        }
        list.add(curr.num);
        preOrder(curr.left, list);
        preOrder(curr.right, list);
    }
    private static void postOrder(Node curr, ArrayList<Integer> list) {
        if (curr == null) {
            return;
        }
        postOrder(curr.left, list);
        postOrder(curr.right, list);
        list.add(curr.num);
    }
}
