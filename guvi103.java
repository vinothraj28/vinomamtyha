package guvi;

import java.util.Scanner;

public class guvi103 {
public static void main(String[] args){
	int input;
	int output=0;
	Scanner in = new Scanner(System.in);
	input=in.nextInt();
	String s=String.valueOf(input);
	for(int i=0;i<=s.length();i++){
		String str=s.substring(0,i);
		
		for(int j=0;j<str.length();j++){
			int num=(str.charAt(j)-48);
			output=output+num;
			}
	}
	System.out.println(output);
	in.close();
}
}
