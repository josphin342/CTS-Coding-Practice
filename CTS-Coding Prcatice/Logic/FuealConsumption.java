/*Sample Input 1:
Enter the no of liters to fill the tank :20
Enter the distance covered: 150

Sample Output 1:
Liters/100KM
          13.33
Miles/gallons
          17.64 */
import java.util.Scanner;
public class FuealConsumption{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	float quantity=sc.nextFloat();
		float distance=sc.nextFloat();
		if(quantity <=0){
		    System.out.println(quantity +" is invalid input");
		    return;
		}
		if(distance <=0){
		    System.out.println(distance +" is invalid input");
		    return;
		}
		
		float fuel=(quantity/distance)*100;
	    float miles=distance*0.6214f;
	    float gallons=quantity*0.2642f;
	    float total=miles/gallons;
	    System.out.printf("%.2f\n",fuel);
	    System.out.printf("%.2f\n",miles);
	    System.out.printf("%.2f\n",gallons);
	    System.out.printf("%.2f\n",total);
		
		
	}
}
