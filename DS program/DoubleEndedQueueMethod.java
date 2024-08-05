import java.util.Scanner;
class DQueueDemo{
    int r=-1;
    int f=-1;
    int n;
    int [] arr;

    DQueueDemo(int n){
        this.n=n;
        arr=new int[n];
    }

    void DQINSERT_rear(int x){
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

    void DQDELETE_front(){
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
    public void DQINSERT_front(int x){
        if(f==0){
            System.out.println("Queue overflow");
            return;
        }
        if(f==-1){
            f=r=0;            
        }
        else{
            f--;
        }
        arr[f]=x;
        return;

 
     }
 
     public int DQDELETE_REAR() {
        if(r==-1){
            System.out.println("Queue underflow");
            return -1;
        }
        int x=arr[r];
        if(f==r){
            f=r=-1;
            return x;
        }
        r--;
        return x;

       
    }
 
    public void DISPLAY() {
        if (f == -1) {
            System.out.println("QUEUE UNDERFLOW!!");
            return;
        }
        for (int i = f; i <= r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return;
    }

     

     }
public class DoubleEndedQueueMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of queue");
        int n=sc.nextInt();
        DQueueDemo q=new DQueueDemo(n);
        int press=0;
        System.out.println("Enter 1 for enqueue from rear");
        System.out.println("Enter 2 for dequeue from front");
        System.out.println("Enter 3 for enqueue from front");
        System.out.println("Enter 4 for dequeue from rear");
        System.out.println("Enter 5 to display");
        System.out.println("Enter -1 to exit");
        while(press!=-1){
            press=sc.nextInt();

            switch(press){
                case 1:
                System.out.println("enter number to enqueue");
                        int x=sc.nextInt();
                        q.DQINSERT_rear(x);
                    
                        break;
                case 2:
                         q.DQDELETE_front();
                        break;
                case 3:
                         System.out.println("enter number to enqueue");
                         x=sc.nextInt();
                        q.DQINSERT_front(x);
                        break;     
                case 4:
                        q.DQDELETE_REAR();
                       break;
                case 5:
                        q.DISPLAY();   
                        break;       
            }


        }
        
    }
}
