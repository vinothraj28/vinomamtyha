package guvi;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args){
		int output = 0;
		Scanner in=new Scanner(System.in);
		int input=in.nextInt();
		int b=1;
		int c=1;
		String s=String.valueOf(input);
		for(int i=0;i<s.length()-1;i++){
			b=1;
			c=1;
			int num=(s.charAt(i)-48);
			int num2=(s.charAt(i+1)-48);
			int num3=(s.charAt(0)-48);
			int num4=(s.charAt(s.length()-1)-48);
			for(int j=0;j<num2;j++){
			b=b*num;
			
				}
			for(int k=0;k<num3;k++){
				c=c*num4;
			}
			
			output+=b;
				
	}
output=output+c;
System.out.println(output);
in.close();
}
}
