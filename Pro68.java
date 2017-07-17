package guvi;

import java.util.Scanner;

public class Pro68 {
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s="";
		String name1 = in.next();
		String name2 = in.next();
		System.out.println("Enter the nth position :");
		int n =in.nextInt();
		System.out.println("Enter the digits :");
		String pin = in.next();
		int len1=name1.length();
		int len2=name2.length();
		String longer=len1!=len2?(len1>len2?name1:name2):name1.charAt(0)<name2.charAt(0)?name1:name2;
		String smaller=len1!=len2?(len2>len1?name1:name2):name1.charAt(0)>name2.charAt(0)?name1:name2;
		/*if(len1==len2){
			longer=name1.charAt(0)<name2.charAt(0)?name1:name2;
			smaller = name1.charAt(0)>name2.charAt(0)?name2:name1;
		}*/
		/*if(len1==len2){
			if(name1.charAt(0)<name2.charAt(0)){
				longer = name1;
				smaller = name2;
           }else{
				smaller = name1;
				longer = name2;
                }
		}*/
		System.out.println(smaller+" "+longer);
		String output=longer.charAt(0)+smaller+pin.charAt(0+n-1)+pin.charAt(pin.length()-n);
for(int i=0;i<output.length();i++){
		if(Character.isUpperCase(output.charAt(i))){
			s+= (char) (output.charAt(i)+32);
		
	
		}else if(Character.isLowerCase(output.charAt(i))){
			s+=(char)(output.charAt(i)-32);
			

		}else{
			s+=output.charAt(i);
		}
	}
System.out.println(s);
}
}
