import java.util.Scanner;
public class Sum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int total=0;
		if(m>n){
		for(int i=n;i<=m;i++){
			total=total+i;
		}
	}
		else{
			for(int i=m;i<=n;i++){
			total=total+i;

		}
	}
	System.out.println("The sum is "+ total);


	}
}