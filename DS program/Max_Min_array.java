import java.util.Scanner;
public class Max_Min_array{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr = new int[n];
		int max=0;
		int maxindex=0;
		int min=Integer.MAX_VALUE;
		int minindex=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
				maxindex=i;
			}
			if(arr[i]<min){
				min=arr[i];
				minindex=i;
			}
		}
		System.out.println(min +","+ minindex);
		System.out.println(max +","+ maxindex);


	}
}