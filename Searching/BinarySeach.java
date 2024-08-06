import java.util.Scanner;

public class BinarySeach {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter a number to Search");
        int target=sc.nextInt();
        int [] arr=new int[n];
        int left=0;
        int right=n-1;
        for(int i=0;i<arr.length;i++){
            System.out.println("arr"+"["+i+"]");
            arr[i]=sc.nextInt();

        }

        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                System.out.println("Element is found "+arr[mid]);
                return;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            
            
        }
        System.out.println("Element not found");

    }
}
