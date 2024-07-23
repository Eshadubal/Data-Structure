import java.util.Scanner;

class LinkedList{
    Node l;
    Node r;
    int data;
   
    class Node{
        int info;
        Node lptr;
        Node rptr;
     Node(int data){
        this.info=data;
        this.lptr=null;
        this.rptr=null;
     }
}
   
    public void InsertAtFirstInDLL(int data){
        Node newNode=new Node(data);
        if(r==null){
            newNode.lptr=null;
            newNode.rptr=null;
            r=newNode;
            l=newNode;
            return;
        }
        Node m=l;
        newNode.lptr=null;
        newNode.rptr=m;
        m.lptr=newNode;
        l=newNode;
    }

    public void insertAtLastOfDLL(int data){
        Node newNode=new Node(data);
        if(r==null){
            newNode.lptr=null;
            newNode.rptr=null;
            r=newNode;
            l=newNode;
            return;
        }
        Node m=r;
        m.rptr=newNode;
        newNode.lptr=m;
        newNode.rptr=null;
        r=newNode;


    }

    public void deleteAtPositionInDLL(int p){
        if(r==null){
            System.out.println("Link list is empty");
            return;
        }

        if(l.info==p){
            l.rptr.lptr=null;
            l=l.rptr;
            return;
        }
        
        if(r.info==p){

            r.lptr.rptr=null;
            r=r.lptr;
            return;
        }
        
       Node m=l;
       while(m!=r && m.info!=p){
        m=m.rptr;
       }
       if (m == r) {
        System.out.println("Node not found");
        return;
    }
       m.lptr.rptr=m.rptr;
       m.rptr.lptr=m.lptr;
        


    }

    public void printList(){
        if(r==null){
            System.out.println("List is empty");
            return;
        }
        Node m = l;
        while (m != r) {
            System.out.print(m.info);
            if (m.rptr != r) {
                System.out.print(" --> ");
            }
            m = m.rptr;
        }
        System.out.println("--->"+r.info);

    }  
    
}
public class DoublyLLMethod {
    public static void main(String[] args) {
        
     Scanner sc=new Scanner(System.in);
     LinkedList li=new LinkedList();
     System.out.println("Enter 1 to insert Node At first in Doubly LinkedList");
     System.out.println("Enter 2 to insert Node At last in Doubly LinkedList");
     System.out.println("Enter 3 to delete  Node from specific position in Doubly LinkedList");
     System.out.println("Enter 4 to display Doubly LinkedList");
     System.out.println("Enter 5 to exit");
     
     int x;
     boolean isDone=true;
    
     while(isDone){
        int press=sc.nextInt();
        switch (press) {
           
            case 1:
                    System.out.println("Enter number to insert");
                    x=sc.nextInt();
                    li.InsertAtFirstInDLL(x);   
                    break;      
                   
             
            case 2:
                System.out.println("Enter number to insert");
                x=sc.nextInt();
                li.insertAtLastOfDLL(x);
                break;   
            
            case 3:
                System.out.println("Enter value to be deleted");
                int p=sc.nextInt();
                li.deleteAtPositionInDLL(p);
                break;    

            case 4:
                      li.printList();
                    break; 

            case 5:
                    isDone=false;
                    break;

             
           
        }
     }
   } 
}

    

