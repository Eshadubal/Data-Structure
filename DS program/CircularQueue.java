import java.util.Scanner;
class CQueueDemo{
    int rear=-1;
    int front=-1;
    int n;
    int [] arr;

    CQueueDemo(int n){
        this.n=n;
        arr=new int[n];
    }
    public void CQINSERT(int x){
        if((rear+1)%n==front){
             System.out.println(" QUEUE OVERFLOW");
             return;
        }
        rear=(rear+1)%n;
        arr[rear]=x;
        System.out.println("Element is inserted at:"+rear);
        if(front==-1){
           front=0;
        }
        return;
 
     }
 
     public int CQDELETE(){
         if(front==-1){
             System.out.println(" QUEUE UNDERFLOW");
             return -1;
         }
         int x=arr[front];
         if(front==rear){
             front=rear=-1;
             return x;
         }
         front=(front+1)%n;
         return x;
     }
 
     public void CQDISPLAY(){
        if(front==-1){
            System.out.println("Queue is empty");
            return;
        }
        if(front<=rear){
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }else{
            for(int i=front;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
     

     }

 

public class CircularQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of queue");
        int n=sc.nextInt();
        CQueueDemo q=new CQueueDemo(n);
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
                        q.CQINSERT(x);
                    
                        break;
                case 2:
                        q.CQDELETE();
                        break;
                case 3:
                        System.out.println("display queue");
                        q.CQDISPLAY();
                        break;       
            }


        }
        
    }
}
