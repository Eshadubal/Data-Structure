import java.util.Stack;
import java.util.Scanner;

public class InfixToPostfix {

    
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
        String infix = sc.nextLine();
        String postfix = "";
        
        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            
            
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
                    while (!s.isEmpty() && precedence(c)<precedence(s.peek())) {
                        postfix = postfix + s.pop();
                    }
                }
                else{
                    while (!s.isEmpty() && precedence(c)<= precedence(s.peek())) {
                        postfix = postfix + s.pop();
                    }

                }
                
                s.push(c);
            }
        }

       
        while (!s.isEmpty()) {
            postfix = postfix + s.pop();
        }

        System.out.println("Infix Expression: " + infix);
        System.out.println("Postfix Expression: " + postfix);
    }
}
