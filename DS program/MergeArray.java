import java.util.*;
public class MergeArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index of array a");
		int n=sc.nextInt();
		System.out.println("Enter index of array b");
		int m=sc.nextInt();
		int j=0;
		int [] a=new int [n];
		int [] b=new int [m];
		int [] c=new int [m+n];
		System.out.println("***********************************");
         for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		} 
		System.out.println("***********************************");
         for(int i=0;i<b.length;i++){
			b[i]=sc.nextInt();
		} 


		for(int i=0;i<a.length;i++){
			c[i]=a[i];
		}
		for(int i=n;i<b.length+n++++;i++){
			c[i]=b[j];
			j++;
		}
		System.out.println(Arrays.toString(c));

	}
}