package stack;

public class Stack {
    private int stack[];
    private int top = -1;

    public Stack() {

    }

    public Stack(int size) {
        stack = new int[size];

    }

    private boolean isFull() {
        return top == stack.length - 1;
    }

    private boolean isEmpty() {
        return top < 0;
    }

    public void push(int data) {
        if (isFull())
            System.out.println("Stack is overflow");
        else {
            stack[++top] = data;
            System.out.println(data + " is pushed");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is underflow");
            return -1;
        } else {

            return stack[top--];
        }

    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        } else
            return stack[top];

    }

    public void show() {
        if (isEmpty())
            System.out.println("Stack is underflow");

        else {
            int temp = top;
            while (temp >= 0 && temp < stack.length) {
                System.out.println(stack[temp]);
                temp--;
            }
        }
    }
}
