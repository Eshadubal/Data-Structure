import java.util.Scanner;

class StackImplementation {
    int data;
    Node top;

    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return;
        }
        newNode.link = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack underflow");
            return -1;
        }
        Node save = top;
        top = save.link;
        return save.info;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.info;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class ImplementStackUsingLinkList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackImplementation s1 = new StackImplementation();
        System.out.println("Press 1 for push");
        System.out.println("Press 2 for pop");
        System.out.println("Press 3 for peek");
        System.out.println("Press 4 to exit");
        
        boolean isTheEnd = true;

        while (isTheEnd) {
            int press = sc.nextInt();
            switch (press) {
                case 1:
                    System.out.println("Enter a number to push in linked list");
                    int num1 = sc.nextInt();
                    s1.push(num1);
                    break;

                case 2:
                    int poppedValue = s1.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped value: " + poppedValue);
                    }
                    break;

                case 3:
                    int peekValue = s1.peek();
                    if (peekValue != -1) {
                        System.out.println("Top value: " + peekValue);
                    }
                    break;

                case 4:
                    isTheEnd = false;
                    break;

                default:
                    System.out.println("Enter valid input");
            }
        }

        sc.close();
    }
}
