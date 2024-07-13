import java.util.*;	
	class LinkedList{
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
           

		public void InsertAtFirst(int data){
      	Node newNode=new Node(data);
      	if (first==null){
      		first=newNode;
      		return;
      		
      	}
      	else{
      		Node save=first;
      		first=newNode;
      		first.link=save;
      		        

      	}
	}
	public void InsertAtLast(int data){
		Node newNode=new Node(data);
		if(first==null){
			first=newNode;
			return;
		}
		else{
			Node save=first;
			while(save.link!=null){
				save=save.link;
			}
			save.link=newNode;
		}
	}

	public void InsertInOrder(int data){
		Node newNode=new Node(data);
		if(first==null){
			newNode.link=null;
			return;
		}
			
		else{
			
			if(newNode.info<=first.info){
				newNode.link=first;
			}
			else{
				Node save=first;
				while(save.link==null && newNode.info>=save.link.info){
					save=save.link;
                }
                newNode.link=save.link;
                save.link=newNode;
                
			}
		}
	}

   public void printList() {
    
    
        Node save=first;
        
        while (save.link!= null) { 
        System.out.print(save.info + "---->"); 
            save = save.link; 
        } 
    } 

    public void countNodes(){
    	Node save=first;
    	int count=0;

    	if(first==null){
    		System.out.println("count is 0 ");
    	}
    	else{
    		while(save.link!=null){
    			count++;
    			save=save.link;
    		}
           System.out.println("No of nodes:"+ count);
    	}
    }
    public void deleteFromFirstPosition(){
    	if(first==null){
    		System.out.println("List is empty");
    		return;
    	}
       first=first.link; 
    }
    public void deleteFromLastPosition(){
    	if(first==null){
    		System.out.println("List is empty");
    		return;
    	}
       Node save=first;
       while(save.link.link!=null){
       	save=save.link;	
       }
       save.link=null;

    }
     public void deleteFromAnyPosition(int p) {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }

        Node save = first;
        Node prev = null;

        if (save.info == p) {
            first = save.link;
            return;
        }
        while (save != null && save.info != p) {
            prev = save;
            save = save.link;
        }
        if (save == null) {
            System.out.println("Node not found");
            return;
        }
        prev.link = save.link;
    }

}


public class LinkedListMethod{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);

			
			System.out.println("Enter 1 to insert at first");
			System.out.println("Enter 2 to insert at last");
			System.out.println("Enter 3 to insert in between");
			System.out.println("Enter 4 to display");
			System.out.println("Enter 5 to count NOdes");
			System.out.println("Enter 6 to delete from first position");

			LinkedList l1=new LinkedList();

			boolean isTheEnd = false;
			
			
			while(true){
				System.out.println("press 1,2,3,4,5,6,7,8,9 as per ur need");
				int press=sc.nextInt();

				switch(press){
				case 1 : 
							System.out.println("Enter number to insert");
							 int num1=sc.nextInt();
							 l1.InsertAtFirst(num1);
							 break;
				case 2 :	
				           System.out.println("Enter number to insert");
							 int num2=sc.nextInt();
							 l1.InsertAtLast(num2);
							 break;			 

				case 3 :    	
				           System.out.println("Enter number to insert");
							 int num3=sc.nextInt();
							 l1.InsertInOrder(num3);
							 break;		
				case 4:
							l1.printList();
							break;

				case 5 : 
							l1.countNodes();
							break;
				case 6 :
							l1.deleteFromFirstPosition();
							break;
				case 7 :
							l1.deleteFromLastPosition();
							break;
				case 8:
                            System.out.println("Enter Number to be deleted");
                            int pos=sc.nextInt();
							l1.deleteFromAnyPosition(pos);
							break;

                case 9:
                    System.out.println("Exiting the process");
                    isTheEnd = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            if (isTheEnd==true) {
                break;			
				}
			}
	

      


      }
	}
