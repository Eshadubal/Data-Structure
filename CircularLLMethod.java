import java.util.*;
class LinkedList{
    Node first;
    Node last;
    class Node{
        Node link;
        int info;
        Node(int data){
            this.info=data;
            this.link=null;
        }

    }
    public void insertAtFirstInCLL(int data){
        Node newNode=new Node(data);
        if(first==null){
        first=newNode;
        last=newNode;
        return;
        }
        newNode.link=first;
        last.link=newNode;
        first=newNode;

    }
    public void insertAtLastOfCLL(int data){
        Node newNode=new Node(data);
        if(first==null){
            first=newNode;
            last=newNode;
            return;
        }
        last.link=newNode;
        newNode.link=first;
        last=newNode;
    }
    public void deleteAtPosition(int p){
        if(first==null){
            System.out.println("linklist is empty");
            return;
        }
        Node save=first;
        Node pred=null;
        if(p==first.info){
            last.link=first.link;
            first=first.link;

        }
        else if(p==last.info){
            while(save.link!=null){
                save=save.link;
            }
            save.link=first;
            last=save;
        }
        else{
            while(save.info!=p){
                pred=save;
                save=save.link;
            }
            if (save == last) {
                System.out.println("Node not found");
                return;
            }
            pred.link=save.link;
        }
       

    }

    public void printList(){
        if(first==null){
            System.out.println("List is empty");
            return;
        }
        Node save = first;
        while (save != last) {
            System.out.print(save.info);
            if (save.link != last) {
                System.out.print(" --> ");
            }
            save = save.link;
        }
        System.out.println("--->"+last.info);

    }
    public void countNodesInCLL() {
        int count = 0;
        if (first == null) {
            System.out.println("Count is 0");
            return;
        }
    
        Node save = first;
        do {
            count++;
            save = save.link;
        } while (save != first);
    
        System.out.println("Total no of Nodes = " + count);
    }
    

    
}
public class CircularLLMethod {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     LinkedList li=new LinkedList();
     System.out.println("Enter 1 to insert Node At first in Circular LinkedList");
     System.out.println("Enter 2 to insert Node At last in Circular LinkedList");
     System.out.println("Enter 3 to delete  Node from specific position in Circular LinkedList");
     System.out.println("Enter 4 to display in Circular LinkedList");
     System.out.println("Enter 5 to count thenumber of nodes");
     System.out.println("Enter 6 to exit");
     
     int x;
     boolean isDone=true;
    
     while(isDone){
        int press=sc.nextInt();
        switch (press) {
           
            case 1:
                    System.out.println("Enter number to insert");
                    x=sc.nextInt();
                    li.insertAtFirstInCLL(x);
                    break;      
                   
             
            case 2:
                System.out.println("Enter number to insert");
                x=sc.nextInt();
                li.insertAtLastOfCLL(x);
              
                break;   
            
            case 3:
                System.out.println("Enter value to be deleted");
                int p=sc.nextInt();
                li.deleteAtPosition(p);

                break;    

            case 4:
                    li.printList();   
                    break; 
            case 5:
                    li.countNodesInCLL();   
                    break; 

            case 6:
                    isDone=false;
                    break;

             
           
        }
     }
   } 
}
