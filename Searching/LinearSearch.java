import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter a number to Search");
        int target=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("arr"+"["+i+"]");
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Target number is Present in the array "+arr[i]);
                break;
            }
            else{
                System.out.println("Target element is not found in the array");
            }

        }
        
    }
}