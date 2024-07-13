import java.util.Scanner;
public class SameAandB{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String input=sc.nextLine();
		int count=0;
		int flag=0;
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)=='a'){
				count++;
			}
			else{
				flag++;
			}
			

		}
		if(flag==count){
				System.out.println("valid String");
			}
			else{
				System.out.println("Invalid String");
			}
		
	}
}