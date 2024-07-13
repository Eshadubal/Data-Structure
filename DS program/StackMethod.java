import java.util.*;

class StackD{
	int top=-1;
	int n;
	int[] arr;
	StackD(int n) {
        this.n=n;
        arr = new int[n];
    }

	 void push(int x){
		if(top>(n-1)){
			System.out.println("Stack StackOverflow");
		}
		else{
			top++;
			arr[top]=x;
			System.out.println("Element Pushed Succesfully");
		}


	}
	 void pop(){
		if(top==-1){
			System.out.println("Stack Underflow");
		}
		else{
			arr[top]=0;
			top--;
			System.out.println("Element poped");
		}


	}
	 void peep(int i){
		if(top-i<=-1){
			System.out.println("no index found");
		}
		else{
			
			System.out.println("The ith element is:"+arr[top-i]);
		}
	}
	void change(int i,int x){
		if(top-i<=-1){
			System.out.println("No index Found");
		}
		else{
			arr[top-i]=x;
			System.out.println("Element changed Succesfully");


		}
	}
	void display(){
		for(int j=0;j<n;j++){
			System.out.println(Arrays.toString(arr));
		}
	}
	


}
public class StackMethod{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		 int n = sc.nextInt();
        StackD sd=new StackD(n);
		System.out.println("Enter 1 for Push \n Enter 2 for Pop \n Enter 3 for Peep \n Enter 4 for Change \n Enter 5 for display");
		boolean isTheEnd = false;
		while(true){
			System.out.println("Enter your choice");
			int press=sc.nextInt();

		switch(press){ 
		case 1 :	
			System.out.println("enter element to push:");
			int x=sc.nextInt();
			sd.push(x);
			break;
		
		case 2 :

				sd.pop();
				break;
		
        case 3 :
        	System.out.println("Enter the index to see the element:");
                    int i = sc.nextInt();
        			sd.peep(i);
        			break;
        
        case 4 :
        	System.out.println("Enter the index to change the element and number to change:");
                     i= sc.nextInt();
                     x=sc.nextInt();
        			sd.change(i,x);
        			break;
        
        case 5 :
        	sd.display();
        	break;
        
        case 6:
                    isTheEnd = true;
                    break;
        default:
                    System.out.println("Please Enter valid choice");
            }
            if (isTheEnd==true) {
                break;
            }

        
		}

	}
		
	}
