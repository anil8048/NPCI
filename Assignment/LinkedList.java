class LinkedList {    
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
    public Node head = null;    
    public Node tail = null; 
    
    //add elements to linkedlist
    public void add(int data) {    
        Node newNode = new Node(data);    
        if(head == null) {    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            tail.next = newNode;    
            tail = newNode;    
        }    
    }  
    
    //display elemnts in linkedlist
    public void get() {    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        while(current != null) {    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    } 
    
    //delete element from linkedlist
    public void remove() {  
  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            if(head != tail ) {  
                Node current = head;  
                while(current.next != tail) {  
                    current = current.next;  
                }  
                tail = current;  
                tail.next = null;  
            }  
            else {  
                head = tail = null;  
            }  
        }  
    }  
        
}    
public class Main
{
	public static void main(String[] args) {    
            
        LinkedList list = new LinkedList();    
            
        list.add(1);    
        list.add(2);    
        list.add(3);    
        list.add(4);
        
        System.out.println("Elements Of Linkedlist are:");    
        list.get(); 
        
        list.remove();
        
        System.out.println("Elements Of Linkedlist are:");  
        list.get();

    }    
}
