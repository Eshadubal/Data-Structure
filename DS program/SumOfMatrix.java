import java.util.*;
public class SumOfMatrix{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int [][] a=new int[2][2];
    int [][] b=new int[2][2];
    int [][] sum=new int[2][2];
    System.out.println("Arrray a");
    for(int i=0;i<2;i++){
    	for(int j=0;j<2;j++){
    		a[i][j]=sc.nextInt();
    	}
    }
    	System.out.println("Arrray b");
    for(int i=0;i<2;i++){
    	for(int j=0;j<2;j++){
    		b[i][j]=sc.nextInt();
    	}
    }
    System.out.println("sum of array");
    for(int i=0;i<2;i++){
    	for(int j=0;j<2;j++){
    		sum[i][j]=a[i][j]+b[i][j];
    	}
    }
    for(int i=0;i<2;i++){
    	for(int j=0;j<2;j++){
    		System.out.println(sum[i][j]);
    	}
    }
    
	
}
}