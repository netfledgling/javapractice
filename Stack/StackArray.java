package Stack;

public class StackArray {
    
    String[] stackArray; 
    int top;

    public StackArray(int size) {
        this.stackArray = new String[size];
        top = -1; 
    }

    public void push(String element) {
        if (top != stackArray.length) {
            stackArray[++top] = element;
        }
    }

    public void pop() {
        stackArray[top--] = null;
    }

    public void display() {
        for (int i = 0; i < stackArray.length; i++) {
            if (stackArray[i] != null) {
                System.out.println(stackArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackArray newStack = new StackArray(5);
        newStack.push("4");
        newStack.push("5");
        newStack.push("6");

        newStack.display();

        newStack.pop();
        System.out.println("After popping: ");

        newStack.display();

    }

}
