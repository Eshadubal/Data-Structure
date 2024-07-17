import java.util.Scanner;

class LinkedList {
    Node first;

    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

  public void InsertAtLast(int data){ 
    Node newNode=new Node(data);
    if(first==null){
        first=newNode;
        return;
    }
        Node save=first;
        while(save.link!=null){
            save=save.link;
        }
        save.link=newNode;
    
} 
    public void printList() {
        if (first == null) {
            System.out.println("Linked list is empty");
            return;
        }

    Node save = first;
    while (save != null) {
        System.out.print(save.info + " ----> ");
        save = save.link;
    }
    System.out.println("null");
}

public void reverse() {
    Node prev = null;
    Node save= first;
    Node link = null;
    while (save!= null) {
        link = save.link; // Store next node
        save.link = prev; // Reverse the current node's pointer
        prev = save; // Move prev to current
        save = link; // Move to next node
    }
    first = prev; // Update head to the new first node
}
}

public class ReverseALinkedList {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList l1 = new LinkedList();

    System.out.println("Enter numbers to insert. If you want to exit, enter -1.");
    int x = sc.nextInt();;
    while (x != -1) {
        l1.InsertAtLast(x);
        x = sc.nextInt();
    }
    System.out.println("Original list:");
        l1.printList();

        l1.reverse();

        System.out.println("Reversed list:");
        l1.printList();

    
}
}

