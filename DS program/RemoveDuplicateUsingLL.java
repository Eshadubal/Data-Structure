import java.util.Scanner;

class LinkedList {
    Node first;

    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        } else {
            Node save = first;
            while (save.link != null) {
                save = save.link;
            }
            save.link = newNode;
        }
    }

    public void printList() {
        Node save = first;
        while (save != null) {
            System.out.print(save.info);
            if (save.link != null) {
                System.out.print(" --> ");
            }
            save = save.link;
        }
        System.out.println(); // For a new line after printing the list
    }

    public void removeDuplicates() {
        Node save = first;
        while (save != null && save.link != null) {
            if (save.info == save.link.info) {
                save.link = save.link.link;
            } else {
                save = save.link;
            }
        }
    }
}

public class RemoveDuplicateUsingLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        System.out.println("Enter elements of the list (-1 to exit):");
        int x = sc.nextInt();
        while (x != -1) {
            l1.insertAtLast(x);
            x = sc.nextInt();
        }
        System.out.println("Original list:");
        l1.printList();
        l1.removeDuplicates();
        System.out.println("List after removing duplicates:");
        l1.printList();
    }
}
