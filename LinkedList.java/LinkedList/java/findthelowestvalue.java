/*
 * In the code below , 
 * the algorithm to find the lowest value is moved into a function call (fIndLowestValue)
 */

public class findthelowestvalue {
 
    
public static void  main (String[]args){
    Node head1 = new Node(5);
    Node node2 = new Node(3);
    Node node3 = new Node(8);
   
    Node node4 = new Node(2);
    Node node5 = new Node(9);

    head1.next = node2;
    node2.next = node3;

    node3.next = node4;
    node4.next = node5;
    System.out.println(findLowestValue(head1));
   

}

    
    public static int findLowestValue(Node head ){
        int minValue = head.data;
        Node currentNode = head.next;
        while(currentNode != null){
            if(currentNode.data <minValue){
                minValue = currentNode.data;
            }
           currentNode = currentNode.next; 
        }
        return minValue;
            
    }

   

}

class Node{
      
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;

    }
}
