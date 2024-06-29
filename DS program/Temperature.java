import java.util.Scanner;
class Temp{
		public void tempCelciousToFarenheit(int temp){
		int ans=(((9/5)*temp)+32);
		System.out.println(ans);

	}
	public void tempFarenheitToCelcious(int temp){
		int ans=(temp-32)*(5/9);
		System.out.println(ans);

	}
}

public class Temperature{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to convert farhenhit to celcious and  2 to convert celcious to farhenhit:");
		int n=sc.nextInt();
		int temp=sc.nextInt();
		Temp t1=new Temp();
	   if(n==1){
	   	t1.tempCelciousToFarenheit(temp);
	   }
	
	else if( n==2){
		t1.tempFarenheitToCelcious(temp);

	}
}
}