import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"]");
            arr[i]=sc.nextInt();
        }
            int i=1;
            
        while(i<n){
            int key=arr[i];
            int j=i-1;
            

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            i++;

        }
        System.out.println(Arrays.toString(arr));
        
    }
}
