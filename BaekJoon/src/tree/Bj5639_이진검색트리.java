package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5639_이진검색트리 {
    private static StringBuilder sb;

    private static class Node {
        int num;
        Node left;
        Node right;

        Node(int num) {
            this.num = num;
        }

        void add(Node node) {
            if (this.num < node.num) {
                if (this.right != null) {
                    this.right.add(node);
                } else {
                    this.right = node;
                }
            } else {
                if (this.left != null) {
                    this.left.add(node);
                } else {
                    this.left = node;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        Node root = new Node(Integer.parseInt(br.readLine()));
        while (true) {
            String str = br.readLine();
            if (str == null) {
                break;
            }

            root.add(new Node(Integer.parseInt(str)));
        }
        postOrder(root);

        System.out.println(sb.toString());
    }

    private static void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        sb.append(node.num).append('\n');
    }
}
