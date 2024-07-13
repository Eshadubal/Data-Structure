import java.util.*;
import java.util.Stack;
public class GrammerStack{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Stack<Character> s=new Stack<Character>();
		 System.out.println("Enter valid string with spaces");
		String lang=sc.nextLine();
		int index=0;
		char x=' ';
		
			for(int i=0;i<lang.length();i++){
				if(lang.charAt(i)=='c'){
					index=i;
					break;
				}
					else{
						s.push(lang.charAt(i));
					}
				
			}
			Boolean isFound=true;
			for(int i=index+1;i<lang.length()-1;i++){

				
				if(lang.charAt(i)!=s.pop()){
					isFound=false;
					break;
				}
				
				}


			if(!isFound){
					System.out.println("Invalid String");
				}
				else{
					System.out.println("Valid String");
				}

		       
			}
			}
			
			
		
