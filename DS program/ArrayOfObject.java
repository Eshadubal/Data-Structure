import java.util.Scanner;
class Student{
	int enrollment_No;
	String name;
	int sem;
	double cpi;
     Student(int enrollment_No,String name,int sem,double cpi){
		this.enrollment_No=enrollment_No;
		this.name= name;
		this.sem=sem;
		this.cpi=cpi;
	}
	public void display(){
	        System.out.println("Name   :"+name);
			System.out.println("Enrollment_No  :"+enrollment_No);
			System.out.println("Sem  :"+sem);
			System.out.println("CPI  :"+cpi);
			System.out.println("********************************************");

	}

}

public class ArrayOfObject{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Student[] stu=new Student[5];
       stu[0]=new Student(21,"Esha" ,1,9.02);
       stu[1]=new Student(22,"Rashi",2,9.04);
       stu[2]=new Student(23,"Diya", 3 ,9.02);
       stu[3]=new Student(24,"Jeeya",4,9.22);
       stu[4]=new Student(25,"Yashvi",5,9.0);
       
       
       
       

		for(int i=0;i<5;i++){
			stu[i].display();
		}

		

		


		}

	}
