import java.util.Scanner;


class Swap{

	void swapOpertion(int num1,int num2){
	int c=0;
	c=num1;
	num1=num2;
	num2=c;
	System.out.println("After swaping:"+ num1);
	System.out.println("After swaping:"+ num2);


}

  

}
public class SwapNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1:");
		int num1=sc.nextInt();
		System.out.println("enter number 2:");
		int num2=sc.nextInt();
		System.out.println("Before swaping:"+ num1);
	    System.out.println("Before swaping:"+ num2);
		Swap s1 =new Swap();
		s1.swapOpertion(num1,num2); 


	}
}