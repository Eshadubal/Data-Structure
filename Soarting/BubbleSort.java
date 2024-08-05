import java.util.*;

public class BubbleSort {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size Of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        System.out.println("arr"+"["+i+"]");
        arr[i]=sc.nextInt();
    }
    int last=n-1;

    for(int i=0;i<=n-2;i++){
        int exchs=0;
        for(int j=0;j<=last-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                exchs=exchs+1;

            }

            
        }
        if(exchs==0){
            System.out.println("The array is already soarted");
        }
        else{
                last=last-1;
        }

        
    }
    System.out.println(Arrays.toString(arr));

   } 
}
