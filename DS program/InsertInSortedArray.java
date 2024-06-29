import java.util.*;

public class InsertInSortedArray {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array:");
        int n = sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the element to be added:");
        int e=sc.nextInt();

        int [] newarr = new int[n+1];
        int k=0;
        boolean isAdded=false;
        for(int i=0;i<newarr.length;i++){
            if(e<=arr[k] && !isAdded){
                newarr[i]=e;
                isAdded=true;
            }else{
                newarr[i]=arr[k];
                k++;
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
