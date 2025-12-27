package Stack;

public class StackArrayV1 {

    String[] stackArray;

    public StackArrayV1(int size) {
        this.stackArray = new String[size];
    }

    public void push(String element) {
        for (int i = 0; i < stackArray.length; i++) {
            if (stackArray[i] == null) {
                stackArray[i] = element; 
                break;
            }
        }
    }

    public void pop() {
        for (int i = 0; i < stackArray.length; i++) {
            if (stackArray[i] == null) {
                stackArray[i-1] = null;  
                break;
            }
        }
    }

    public String get(int index) {
        return stackArray[index];
    }

    public int size() {
        return stackArray.length;
    }

    public void display() {
        for (int i = 0; i < stackArray.length; i++) {
            if (stackArray[i] != null) {
                System.out.println(stackArray[i]);
            }
        }
    }

    public static void main(String[] args) {

        StackArrayV1 newStack = new StackArrayV1(5);
        newStack.push("4");
        newStack.push("5");
        newStack.push("3");

        newStack.display();

        newStack.pop();
        System.out.println("After popping the last element: ");

        newStack.display();
    }
}