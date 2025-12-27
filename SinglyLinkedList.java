package SinglyLinkedList;

public class SinglyLinkedList {

    Node head;
    int size;

    public SinglyLinkedList() {
        this.head = null;
        size = 0;
    }

    public void add(int data) {
        Node newElement = new Node(data);
        if (head == null) {
            head = newElement;
        } else {
            Node current = head;

            while (current.next!=null) {
                current = current.next;
            }
            current.next = newElement;
        }
        size++;
    }

    public void remove(int data) {
        if (head==null) {return;}
        else if (head.data == data) {head=head.next;}
        else {
            Node current = head;

            while (current.next!= null && current.next.data != data) {
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }
    }

    public void display() {
        Node current = head;
        System.out.println("Displaying linked list.");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int size() {
        System.out.println("Size of linked list: " + size);
        return size;
    }

    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList(); 
        myList.add(2);
        myList.add(4);
        myList.add(5);
        myList.remove(4);
        myList.size();
        myList.display();
    }
    
}
