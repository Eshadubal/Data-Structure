import java.util.Scanner;
import java.util.Stack;

   
public class ValidParenthesis{
	public static void main(String[] args) {
		Stack<Character> s=new Stack<Character>();
		Scanner sc=new Scanner(System.in);
		

		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='('){
				s.push(')');
			}
			else if(str.charAt(i)=='['){
				s.push(']');
			}
			else if(str.charAt(i)=='{'){
				s.push('}');
			}
			 else if(s.isEmpty()|| s.pop()!=str.charAt(i)){
            System.out.println("Invalid string");
            
			}
			else{
				System.out.println("Valid String");
			
			}

			
		}

    }		
}	
