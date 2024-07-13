import java.util.Scanner;
class LLCheck{
	Node first;
	int data;
class Node{
	int info;
	Node link;

Node(int data){
	this.info=data;
	this.link=null;
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

public boolean CheckLL( LLCheck l1,LLCheck l2){
   Node save1=l1.first;
   Node save2=l2.first;
   while(save1!=null && save2!=null){
	if(save1.info!=save2.info){
		return false;
	}
	save1=save1.link;
	save2=save2.link;
	
   }
   return save1 == null && save2 == null;
}
}
	



public class LinkedListAreSAmeOrNot{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LLCheck l1  =new LLCheck();
		LLCheck l2  =new LLCheck();
		System.out.println("Enter numbers to insert. If you want to exit, enter -1.");
        int x = sc.nextInt();;
        while (x != -1) {
            l1.InsertAtLast(x);
            x = sc.nextInt();
        }
		System.out.println("Enter numbers to insert. If you want to exit, enter -1.");
        int y = sc.nextInt();;
        while (y != -1) {
            l2.InsertAtLast(y);
            y = sc.nextInt();
        }

        System.out.println("First list:");
        l1.printList();
		System.out.println("Second list:");
        l2.printList();
		
		if (l1.CheckLL(l1, l2)) {
            System.out.println("The linked lists are identical.");
        } else {
            System.out.println("The linked lists are not identical.");
        }
		
		




		
		
		
	}

}