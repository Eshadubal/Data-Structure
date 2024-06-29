import java.util.*;

public class RemoveNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
	int n=sc.nextInt();
	System.out.println("Enter index");
	int index=sc.nextInt();
	int [] arr1= new int[n];
	int [] arr2= new int[n-1];
	int j=0;
	System.out.println("**************************************************");

	for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}

		System.out.println("**************************************************");
		for(int i=0;i<arr1.length;i++){
			if(i!=index){
				arr2[j]=arr1[i];
				j++;

			}
			else{
				continue;
			}
			
		}
		System.out.println(Arrays.toString(arr2));


	
	}
	
	
}
		
		
