package LinkedList;

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        if (head == null) {
            head = newnode;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = newnode;
        }

    }

    public void insertAtStart(int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = head;
        head = newnode;
    }

    public void insertAt(int data, int idx) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        if (idx == 0)
            insertAtStart(data);
        else {
            Node n = head;
            for (int i = 0; i < idx - 1; i++) {
                if (n.next != null)
                    n = n.next;
                else {
                    System.out.println("Your index is out of bound ill add it at last");
                    break;
                }
            }
            newnode.next = n.next;
            n.next = newnode;
        }
    }

    public void deleteAt(int idx) {
        if (idx == 0)
            head = head.next;
        else {
            Node n = head;
            for (int i = 0; i < idx - 1; i++)
                n = n.next;
            Node n1 = n.next;
            n.next = n1.next;
            System.out.println(n1.data + " is deleted ");
            n1 = null;
        }
    }

    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}
