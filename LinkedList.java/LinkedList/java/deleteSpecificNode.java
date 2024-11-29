
public class deleteSpecificNode {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void traverseAndPrint(Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static Node deleteSpecificNode(Node head, Node nodeToDelete) {
        if (head == nodeToDelete) {
            return head.next;
        }

        Node currentNode = head;
        while (currentNode.next != null && currentNode.next != nodeToDelete) {
            currentNode = currentNode.next;
        }

        if (currentNode.next == null) {
            return head;
        }

        currentNode.next = currentNode.next.next;

        return head;
    }

    public static void main(String[] args) {
        Node node1 = new Node(7);
        Node node2 = new Node(11);
        Node node3 = new Node(3);
        Node node4 = new Node(2);
        Node node5 = new Node(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println("Before deletion:");
        traverseAndPrint(node1);

        node1 = deleteSpecificNode(node1, node4);

        System.out.println("\nAfter deletion:");
        traverseAndPrint(node1);
    }
}

//Java
         

