import java.util.Scanner;
class Detail{
	int account_number;
	int balance; 
    String name;
    Detail(int account_number,String name,int balance){
    	this.account_number=account_number;
    	this.balance=balance;
    	this.name=name;

    }

    public void display(int account_number,int balance,String name){
    	System.out.println("Nme:   "+name);
    	System.out.println("Balance:   "+balance);
    	System.out.println("actnumber:   "+account_number);
    }

    public void withdraw(int balance,int amount){
    	balance=balance-amount;
    	System.out.println("Balance is:"+ balance);
    	
    }
     public void deposite(int balance,int amount){
    	balance=balance+amount;
    	System.out.println("Balance is:"+ balance);
    	
    }

}




public class BankAccount{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to  withdraw and press 2 to deposite");
		int press=sc.nextInt();
		int amount=sc.nextInt();



		Detail [] det=new Detail[3];

		det[0]=new Detail(123,"Esha",6000000);
		det[1]=new Detail(124,"Jeeya",5000000);
		det[2]=new Detail(125,"Yashvi",9000000);
    

    for(int i=0;i<det.length;i++){
    	det[i].display();

    	if(press==1){
    		det[i].withdraw();
    	}
    	else{
    		det[i].deposite();
    	}

    }


	}
} 