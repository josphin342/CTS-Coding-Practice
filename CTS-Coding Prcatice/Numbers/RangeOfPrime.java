import java.util.*;
public class RangeOfPrime{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int start=sc.nextInt();
	int end=sc.nextInt();
	if(start<=0 ||end<=0 || start>=end){
	    System.out.println("Provide valid input");
	}
    for(int num=start;num<=end;num++){
        if(start<=1)
	        continue;
        boolean isPrime=true;
        int i=2;
        while(i<=num/2){
            if(num%i==0){
            isPrime=false;
            break;
        }
        i++;
        }
        if(isPrime){
            System.out.print(" "+num);
        }
    }

  }
}
