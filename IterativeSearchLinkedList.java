/*
 * Search (Iterative)
 * search for a key in a linked list . return the psotion 
 * where it is found. if not found , return - 1.
 * 
 */

public class IterativeSearchLinkedList {

    public static class Node{
        int data;
        Node next;


        public Node(int data){
            this.data = data;
            this.next = null;
          }
        }
        public static Node head;
        public static Node tail;
        
        

    
        public int itrSearch(int key ){
            Node temp = head;
            int i = 0 ; 

        
            while (temp != null){
                if(temp.data ==key){
                    return i;

                } temp =temp.next;

            }
            return -1;
        }
        public static void main(String[] args) {
            IterativeSearchLinkedList ll = new IterativeSearchLinkedList();
            Node node1 = new Node(7);
            Node node2 = new Node(3);
            Node node3 = new Node(2);
            Node node4 = new Node(9);
    
            node1.next = node2;
            node2.next = node3;
            node3.next = node4; 
            System.out.println("Position of 2: " + ll.itrSearch(2)); // Expected output: 1
            System.out.println("Position of 10: " + ll.itrSearch(10)); 
    
}

    

}