package dsa;

public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    static int countNodes(Node head) {
        int count = 1;
        while (head.next != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head = new Node(6);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println("This linked list has " + countNodes(head) + " nodes.");
    }
}
