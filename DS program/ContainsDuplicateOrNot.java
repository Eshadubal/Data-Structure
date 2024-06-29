import java.util.Scanner;
public class ContainsDuplicateOrNot{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		int count=0;
		System.out.println("****************************");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("***************************");
		for(int i=1;i<arr.length;i++){
			if(arr[i]==arr[i-1]){
				count++;
				
			}

		}
		if(count==0){
			System.out.println("Array does not Contains Duplicate");
		}
		else{
			System.out.println("Array Contains Duplicate");

		}


	}
}