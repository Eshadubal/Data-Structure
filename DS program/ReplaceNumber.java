import java.util.*;
public class ReplaceNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr= new int[n];
		int c=0;
		int j=0;
		int k=0;
		System.out.println("****************************");


		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("enter Number1 to replace ");
		int num1=sc.nextInt();
        System.out.println("enter Number2 to replace ");
		int num2=sc.nextInt();

		System.out.println("****************************");

		for(int i=0;i<arr.length;i++){
			if(arr[i]==num1){
				j=i;
			}
			if(arr[i]==num2){
				k=i;
			}
		}

		c=arr[j];
		arr[j]=arr[k];
		arr[k]=c;  

			System.out.println(Arrays.toString(arr));   
			System.out.println("Num1 index:"+k);
			System.out.println("Num2 index:"+j);   

	
}
}