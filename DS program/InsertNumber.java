import java.util.*;
public class InsertNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
	int n=sc.nextInt();
	System.out.println("Enter index");
	int index=sc.nextInt();
	int [] arr= new int[n+1];
	System.out.println("**************************************************");

	for(int i=0;i<arr.length-1;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("**************************************************");

	for(int i=n-1;i>=index;i--){
		arr[i+1]=arr[i];
	}
	arr[index]=sc.nextInt();
	System.out.println("**************************************************");
	// for(int i=0;i<arr.length;i++){
	// 		System.out.println(arr[i]);	
	// 			}
	// }
	System.out.println(Arrays.toString(arr));
	}
	
}