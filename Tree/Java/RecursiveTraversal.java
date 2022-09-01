import java.util.*;

class Node {

    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class RecursiveTraversal {

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;

        // Function to do inOrder traversal
        inOrder(a);

        // Function to do inOrder traversal
        // PreOrder(a);

        // Function to do inOrder traversal
        // PostOrder(a);

    }

    static void inOrder(Node head) {
        Node temp = head;
        if (temp == null) {
            return;
        }

        inOrder(temp.left);
        System.out.println(temp.value);
        inOrder(temp.right);
    }

    static void PreOrder(Node head) {
        Node temp = head;
        if (temp == null) {
            return;
        }

        System.out.println(temp.value);
        PreOrder(temp.left);
        PreOrder(temp.right);
    }

    static void PostOrder(Node head) {
        Node temp = head;
        if (temp == null) {
            return;
        }

        PostOrder(temp.left);
        PostOrder(temp.right);
        System.out.println(temp.value);

    }
}