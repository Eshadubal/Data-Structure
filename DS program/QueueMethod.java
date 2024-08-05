import java.util.Scanner;
class QueueDemo{
    int r=-1;
    int f=-1;
    int n;
    int [] arr;

    QueueDemo(int n){
        this.n=n;
        arr=new int[n];
    }

    void enqueue(int x){
        if(r>=n-1){
            System.out.println("Queue overflow");
            return;
        }

        r++;
        arr[r]=x;
        System.out.println("Number enqueued");
        if(f==-1){
            f=0;
            return;
        }
        

    }

    void dequeue(){
        if(f==-1){
            System.out.println("Queue Underflow");
            return;
        }
        arr[f]=0;
        if(f==r){
            f=0;
            r=0;
            return;
        }
        f++;

    }

    void display(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
    }
}
public class QueueMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of queue");
        int n=sc.nextInt();
        QueueDemo q=new QueueDemo(n);
        int press=0;
        System.out.println("Enter 1 for enqueue");
        System.out.println("Enter 2 for dequeue");
        System.out.println("Enter 3 for display");
        System.out.println("Enter -1 to exit");
        while(press!=-1){
            press=sc.nextInt();

            switch(press){
                case 1:
                System.out.println("enter number to enqueue");
                        int x=sc.nextInt();
                        q.enqueue(x);
                    
                        break;
                case 2:
                        q.dequeue();
                        break;
                case 3:
                        System.err.println("display queue");
                        q.display();
                        break;       
            }


        }

        
    
        
    }
}
