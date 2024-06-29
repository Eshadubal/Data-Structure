import java.util.*;
public class Anagram{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int count=0;

		System.out.println("Enter index to search");
		int index=sc.nextInt();
		String [] name=new String[n];
		String word=" ";
		for(int i=0;i<n;i++){
			name[i]=ss.nextLine();
		}
        for(int i=0;i<name.length;i++){
        	if(i== index){
        		word=name[i];
        	}
        }
        System.out.println(word);
        int c=word.length();
        String str = ss.nextLine();
        	char [] arr1 = word.toCharArray();
        	char [] arr2= str.toCharArray();
        	System.out.println(Arrays.toString(arr1));
        	Arrays.sort(arr1);
        	Arrays.sort(arr2);
        	if(arr2.length != arr1.length){
        		System.out.println("Not anagram");
        		return;
        	}
        	for(int i=0;i<arr1.length;i++){
        		if(arr1[i] != arr2[i]){
        			System.out.println("Not anagram");
        			return;
        		}
        	}
        	System.out.println("Anagram");

	
	
}
}