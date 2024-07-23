import java.util.Scanner;
class LinkedList{
    Node l;
    Node r;
    class Node{
        Node lptr;
        Node rptr;
        int info;
        Node(int data){
            this.info=data;
            this.lptr=null;
            this.rptr=null;
        }
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

        public void deleteAlternateNode(){
            Node save=l;
            while(save!=null && save.rptr!=null){
                save.rptr=save.rptr.rptr;
                if (save.rptr != null) {
                    save.rptr.lptr = save;
                }
                
                save=save.rptr;
                
            }

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
public class DeleteAlternateNodeinDLL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList li=new LinkedList();
        System.out.println("enter number to insert and enter -1 to exit");
        int x=sc.nextInt();
        while(x!=-1){
            li.insertAtLastOfDLL(x);
            x=sc.nextInt();
         
        }
        System.out.println("original list");
        li.printList();

        li.deleteAlternateNode();

        System.out.println("updated list");
        li.printList();

        
        
        
    }
}
