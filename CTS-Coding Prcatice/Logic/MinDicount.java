import java.util.*;
public class MinDicount
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 sc.nextLine();
	 String[] itemName=new String[n];
	 int [] dis=new int[n];
	 for(int i=0;i<n;i++){
	     String input=sc.nextLine();
	     String[] parts=input.split(",");
	     String name=parts[0].trim();
	     int d=Integer.parseInt(parts[1].trim());
	     int price=Integer.parseInt(parts[2].trim());
	     int DisPrice=(price*d)/100;
	     itemName[i]=name;
	     dis[i]=DisPrice;
	 }
	 int min=dis[0];
	 for(int i=0;i<n;i++){
	     if(dis[i]<min){
	         min=dis[i];
	     }
	 }
	 for(int i=0;i<n;i++){
	     if(dis[i]==min){
	         System.out.println(itemName[i]);
	     }
	 }
	}
}
