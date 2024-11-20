public class LinkedList3 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        if (tail == null) { // If the list is empty
            tail = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode; // Link the last node to the new node
        tail = newNode;      // Update the tail reference
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return -1; // Or throw an exception if appropriate
        }
        int val = head.data;
        head = head.next;
        if (head == null) { // If the list becomes empty, reset the tail
            tail = null;
        }
        return val;
    }

    public static void main(String[] args) {
        LinkedList3 ll = new LinkedList3();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);

        ll.print(); // Print the list before removal
        ll.removeFirst(); // Remove the first element
        ll.print(); // Print the list after removal
    }
}
