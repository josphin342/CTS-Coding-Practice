/*Sample Input 1:
Enter the digits:
65
66
67
68
Sample Output 1:
65-A
66-B
67-C
68-D

Sample Input 2:
Enter the digits:
115
116
101
112
Sample Output 2:
115-s
116-t
101-e
112-p
 */
import java.util.*;
public class CharChange{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the digits");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	int n4=sc.nextInt();
    char c1=(char)n1;
	char c2=(char)n2;
	char c3=(char)n3;
	char c4=(char)n4;
	System.out.print(n1);
	System.out.println("-"+c1);
    System.out.print(n2);
    System.out.println("-"+c2);
	System.out.print(n3);
	System.out.println("-"+c3);
	System.out.print(n4);
	System.out.println("-"+c4);
	
	}
}

