import java.util.Stack;
import java.util.Scanner;

public class InfixToprefix {

    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1; 
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter infix expression:");
        String infix=sc.nextLine();
        String new_infix="";
        String postfix="";
        String prefix="";
        for(int i=0;i<infix.length();i++){
            char c=infix.charAt(i);
            if(infix.charAt(i)=='('){
                s.push(')');
            }
            else if(infix.charAt(i)==')'){
                s.push('(');
            }
            else{
            s.push(c);
            }
        }
        while(!s.empty()){
            new_infix=new_infix+(s.pop());
        }
        
        for (int i = 0; i < new_infix.length(); i++) {
            char c = new_infix.charAt(i);
            
            
            if (c == '(') {
                s.push(c);
            }
            
            else if (Character.isLetterOrDigit(c)) {
                postfix = postfix + c;
            }
            
            else if (c == ')') {
                while (!s.isEmpty() && s.peek() != '(') {
                    postfix = postfix + s.pop();
                }
                s.pop(); 
            }
           
            else {
                if(c=='^'){
                    while (!s.isEmpty() && precedence(c) <= precedence(s.peek())) {
                        postfix = postfix + s.pop();
                    }
                }
                else{
                    while (!s.isEmpty() && precedence(c) < precedence(s.peek())) {
                        postfix = postfix + s.pop();
                    }
                }
                
                s.push(c);
            }
        }

       
        while (!s.isEmpty()) {
            postfix = postfix + s.pop();
        }
        
       for(int i=0;i<postfix.length();i++){
        char b=postfix.charAt(i);
         s.push(b);
    }
    while(!s.empty()){
        prefix=prefix+(s.pop());
    }
       
       System.out.println("infix Expression:"+infix);
       System.out.println("prefix Expression:"+prefix);
        

        
       
    }
}



