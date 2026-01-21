/*Sample Input 1:
Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5
Sample Output 1:
Bill Details
No of pizzas:10
No of puffs:12
No of cooldrinks:5
Total price=1290 */
import java.util.*;
public class TotalCost{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of pizza");
		int pizza=sc.nextInt();
		System.out.println("Enter the no of puffs");
		int puffs=sc.nextInt();
	    System.out.println("Enter the no of cooldrinks");
	    int coold=sc.nextInt();
	    int piR=100;
	    int puR=20;
	    int cr=10;
	    int Tpi=pizza*piR;
	    int Tpu=puffs*puR;
	    int Tc=coold*cr;
	    int total=Tpi+Tpu+Tc;
	    System.out.println(total);
		
	}
}
