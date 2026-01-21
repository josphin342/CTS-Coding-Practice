/*
Sample Input 1:

Enter the no of ticket:35
Do you want refreshment:y
Do you have coupon code:y
Enter the circle:k
Sample Output 1:

Ticket cost:4065.25
Sample Input 2:

Enter the no of ticket:1
Sample Output 2:

Minimum of 5 and Maximum of 40 Tickets */
import java.util.*;
class TicketCost{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        char re=sc.next().charAt(0);
        char co=sc.next().charAt(0);
        char circle=sc.next().charAt(0);
        int tic=0;
        if(t<5 || t>40){
            System.out.println("Minimum of 5 and Maximum of 40 tickets");
            return;
        }
        if(circle=='k'){
            tic=75;
        }
        else if(circle=='q'){
            tic=150;
        }else{
            System.out.println("Invalid Input");
            return;
        }
        double tc=t*tic;
        if(t>20){
            double d1=tc*0.1;
            tc=tc-d1;
        }
        if(co=='y'){
            double d2=tc*0.02;
            tc=tc-d2;
        }
        if(re=='y'){
            tc=tc+(50*t);
        }
        System.out.printf("Ticket cost:%.2f",tc);
    }
}
