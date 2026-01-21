/*
Assume maximum number of courses is 20.
Sample Input 1:
Enter no of course:
5
Enter course names:
Java
Oracle
C++
Mysql
Dotnet
Enter the course to be searched:
C++
Sample Output 1:
C++ course is available

Sample Input 2: 
Enter no of course:
3
Enter course names:
Java
Oracle
Dotnet
Enter the course to be searched:
C++
Sample Output 2:
C++ course is not available
Sample Input 3:
Enter no of course:
0
Sample Output 3:
Invalid Range */

import java.util.*;
public class SearchString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of courses");
		int n=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		System.out.println("Enter the course name");
		int i=0;
		while(i<n){
		    arr[i]=sc.nextLine();
		    i++;
		}	
		System.out.println("Enter the course to be searched");
		String str=sc.nextLine();
		boolean found=false;
		String s="";
		for(int j=0;j<n;j++){
		    if(arr[j].equalsIgnoreCase(str)){
		        found=true;
		        s=arr[j];
		        break;
		    }
		    
		}
		if(found){
		      System.out.println("course found "+ s);
		}else{
		     System.out.println("not found"+ s);
		}
		
	}
}
}
