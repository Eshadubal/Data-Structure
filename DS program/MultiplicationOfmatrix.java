import java.util.Scanner;
public class MultiplicationOfmatrix{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 	int[][] a=new int[2][3];
	    int[][] b=new int[3][2];
	    int[][] Multiplication=new int[2][2];
	    System.out.println("Array a");
         for(int i=0;i<2;i++){
         	for(int j=0;j<3;j++){
         		a[i][j]=sc.nextInt();
         	}
         }
          System.out.println("Array b");
         for(int i=0;i<3;i++){
         	for(int j=0;j<2;j++){
         		b[i][j]=sc.nextInt();
         	}
         }

          System.out.println("Multiplication Of matrix");
         for(int i=0;i<2;i++){ // i<row1
         for(int j=0;j<2;j++){ // j<col2
         for(int k=0;k<3;k++){ // k<row2
         Multiplication[i][j]+=a[i][k]*b[k][j];
         		}
         	}
         }
         
         for(int i=0;i<2;i++){
         	for(int j=0;j<2;j++){
         		System.out.println(Multiplication[i][j]);
         	}
         }



	 }
	}
