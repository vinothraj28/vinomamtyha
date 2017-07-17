package guvi;

import java.util.Scanner;

public class Pro67 {
public static void main(String[] args) {
	boolean ans=false;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the total no of students :");
	int total = in.nextInt();
	System.out.println("Enter the no Friends for Alex in the class :");
	int friends=in.nextInt();
	System.out.println("Enter the binary String :");
	String aw = in.next();
	System.out.println("Enter the id no of Friends :");
	for(int i=0;i<friends;i++){
	int id = in.nextInt();
	for(int j=0;j<aw.length();j++){
		
		if(aw.charAt(id-1)=='0'){
			System.out.println("yes");
		    System.exit(0);
		}
      }
	}
	System.out.println("NO");
 }
}

