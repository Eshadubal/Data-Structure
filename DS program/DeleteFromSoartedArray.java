import java.util.Scanner;
public class DeleteFromSoartedArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of aaray");
		int n=sc.nextInt();
		System.out.println("Enter number to be deleted:");
		int deletenumber=sc.nextInt();
		int [] arr1= new int[n];
		int [] arr2= new int[n-1];
		System.out.println("***********************************");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("***********************************");
		for(int j=0;j<n-1;j++){
			for(int i=j;i<n;i++){
				if(arr1[i]!=deletenumber){
					arr2[j]=arr1[i];
					break;
				}
				else{
					continue;
				}
			}
		}
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}

	}
}
