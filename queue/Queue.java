package queue;

public class Queue {
    int queue[] = new int[5];
    int front = -1, rear = -1;

    private boolean isFull() {
        return rear == queue.length - 1;
    }

    private boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        queue[++rear] = data;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = queue[front++];

        // Reset queue when empty
        if (front > rear) {
            front = rear = -1;
        }

        return data;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

}
