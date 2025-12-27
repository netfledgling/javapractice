package Queue;

public class QueueArray {

    String[] queueArray;
    int front, rear;
    
    public QueueArray(int size) {
        this.queueArray = new String[size];
        this.front = 0;
        this.rear = 0;
    }

    public void enqueue(String element) {
        for (int i = 0; i < queueArray.length; i++) {
            if (queueArray[i] == null) {
                queueArray[i] = element;
                rear = i;
                break;
            }
        }
    }

    public void dequeue() {
        queueArray[front] = null; 
        front++;
    }

    public String peek() {
        System.out.println(queueArray[rear]);
        return queueArray[rear];
    }

    public void display() {
        for (int i = 0; i < queueArray.length; i++) {
            if (queueArray[i] != null) {System.out.println(queueArray[i]);}
        }
    }

    public static void main(String[] args) {

        QueueArray queue = new QueueArray(5);

        queue.enqueue("5");
        queue.enqueue("4");
        queue.enqueue("3");

        queue.display();
        System.out.println("Now dequeing.");

        queue.dequeue();
        System.out.println("After dequeing");

        queue.display();

    }

}
