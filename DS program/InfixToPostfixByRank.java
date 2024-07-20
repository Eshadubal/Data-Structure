import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfixByRank {
    public static int precedenceStack(char s) {
        if ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')) {
            return 8;
        }
        switch (s) {
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 4;
            case '^':
                return 5;
            case '(':
                return 0;
        }
        return -1;
    }

    public static int precedenceInfix(char i) {
        if ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z')) {
            return 7;
        }
        switch (i) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 3;
            case '^':
                return 6;
            case '(':
                return 9;
            case ')':
                return 0;
        }
        return -1;
    }

    public static int rank(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        String polish = "";
        int Rank = 0;
        System.out.println("Enter an infix String:");
        String infix = sc.nextLine();
        s.push('(');
        infix = infix + ")";

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            while (!s.isEmpty() && precedenceStack(s.peek()) > precedenceInfix(c)) {
                char temp = s.pop();
                if (temp != '(') {
                    polish += temp;
                    Rank += rank(temp);
                    if (Rank < 1) {
                        System.out.println("Invalid String2");
                        return;
                    }
                }
            }

            if (precedenceStack(s.peek()) < precedenceInfix(c)) {
                s.push(c);
            } else {
                s.pop();
            }
        }

        if (!s.isEmpty() || Rank != 1) {
            System.out.println("Invalid3");
        } else {
            System.out.println("Valid: " + polish);
        }
    }
}
