package guvi;

import java.util.Scanner;

public class Pro69 {
public static void main(String[] args){
	String input;
	int sum=0;
	int sum1=0;
	int sum2=1;
	int max=-12345;
	int min = 12345;
	Scanner in = new Scanner (System.in) ;
	input = in.nextLine();
	int len=input.length();
	for(int i=0;i<len;i++){
		if(Character.isDigit(input.charAt(i))){
		if((input.charAt(i)-48)>max){
		  max=input.charAt(i)-48;	
		}if(input.charAt(i)-48<min){
			min=input.charAt(i)-48;
		}
		}
	}
	for(int i=0;i<len;i++){
		if(Character.isDigit(input.charAt(i))){
		 sum+=max*(input.charAt(i)-48);
		 sum2*=min+(input.charAt(i)-48);
		}
	}
    int temp=0;
	int temp2=0;
	while(sum>9 ){
		 temp=sum;
		 sum1=0;
	while(temp>0)
		 {
	   sum1+=temp%10;
		temp=temp/10;
		}
		 sum=sum1;
	}
	while(sum2>9 ){
		 temp2=sum2;
		 sum1=0;
	while(temp2>0)
		 {
	   sum1+=temp2%10;
		temp2=temp2/10;
		}
		 sum2=sum1;
	}
	int digit3=sum>sum2?sum2:sum;
	int output = digit3 * digit3;
System.out.println(output);
in.close();
	}
}
