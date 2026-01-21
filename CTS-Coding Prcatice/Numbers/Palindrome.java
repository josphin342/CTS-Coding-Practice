import java.util.*;
public class Palindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int res=num;
		int rev=0;
		int temp=0;
		if(num<=0){
		    System.out.println("Invalid Input");
		    return;
		}
		while(num>0){
		    temp=num%10;
		    rev=rev*10+temp;
		    num=num/10;
		}
		if(res==rev){
		    System.out.println("Palindrome");
		}else{
		    System.out.println("Not a Palindrome");
		}
	}
}