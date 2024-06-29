import java.util.Scanner;
class Employee{
	

	void printEmployeeDetail(int Employee_id,String Employee_Name,String Designation,int Salary){
		System.out.println("***************************************************");
		System.out.println("Employee_id:"+Employee_id);
		System.out.println("Employee_Name:"+Employee_Name);
		System.out.println("Designation:"+Designation);
		System.out.println("Salary"+Salary);
	}



}




public class EmployeeDetail{
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     Scanner ss=new Scanner(System.in);
     System.out.println("Employee_id");
     int Employee_id=sc.nextInt();

     System.out.println("Employee_Name");
     String Employee_Name=ss.nextLine();

     System.out.println("Designation");
     String Designation=ss.next();

     System.out.println("Salary");
     int Salary=sc.nextInt();

     Employee e=new Employee();
     e.printEmployeeDetail(Employee_id,Employee_Name,Designation,Salary);










		
	}
}