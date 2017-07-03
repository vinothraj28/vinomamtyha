package guvi;

import java.util.Scanner;

public class guvi102 {
public static void main(String[] args){
	int output=0;
	int input1;
	Scanner in =new Scanner(System.in);
	input1=in.nextInt();
	int b = 0;
	String s=String.valueOf(input1);
	for(int i=0;i<s.length();i++){
		b=1;
	
		int num=(s.charAt(i)-48);
		for(int j=0;j<s.length();j++){
		b=b*num;
			}
		output+=b;
	}
	System.out.println(output);
	in.close();
	}
}

