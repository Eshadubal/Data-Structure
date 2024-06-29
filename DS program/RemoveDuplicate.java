import java.util.Scanner;
public class RemoveDuplicate{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int j=0;
		int[] arr= new int [n];
		System.out.println("******************************");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("******************************");
         System.out.println(arr[0]);
		for(int i=1;i<arr.length;i++){
			   
				if(arr[i]!=arr[i-1]){
					arr[j]=arr[i];
                  System.out.println(arr[j]);
					j++; 

				} 
				
			
		}
		
		

	}
}