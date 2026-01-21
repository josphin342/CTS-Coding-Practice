/*Spring – March to May,
Summer – June to August,
Autumn – September to November and,
Winter – December to February.
Month should be in the range 1 to 12.  If not the output should be “Invalid month”.

Sample Input 1:

Enter the month:11
Sample Output 1:

Season:Autumn
Sample Input 2:

Enter the month:13
Sample Output 2:

Invalid month
 */
import java.util.Scanner;
public class SeasonofMonth {
  public static void main (String args[]) {
    
    System.out.print ("Enter the month:");
    Scanner s = new Scanner (System.in);
    int entry = s.nextInt ();
    switch (entry){
        case 12:
        case 1:
        case 2:
        System.out.println ("Season:Winter");
        break;
        case 3:
        case 4:
        case 5:
        System.out.println ("Season:Spring");
        break;
        case 6:
        case 7:
        case 8:
        System.out.println ("Season:Summer");
        break;
        case 9:
        case 10:
        case 11:
        System.out.println ("Season:Autumn");
        break;
        default:
        System.out.println ("Invalid month");
              
        }
   }
}
