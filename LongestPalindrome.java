package guvi;

import java.util.Scanner;

public class LongestPalindrome {
public static void main(String[] args){
	String str;
	int n=0;
	String palindrome="";
	Scanner s=new Scanner(System.in);
	str=s.nextLine();
	String[] s1=new String[50];
	for(int i=0;i<str.length();i++){
		for(int j=0;j<str.length()-i;j++){
		StringBuffer str1=new StringBuffer(str.substring(i,i+j));
		StringBuffer str2=new StringBuffer(str1).reverse();
		String str3=str1.toString().toLowerCase();
		String str4=str2.toString().toLowerCase();
		if(str3.equals(str4)){
			s1[n++]=str3;
		}
		}
	}
	for(int i=0;i<n;i++){
		if(s1[i].length()>palindrome.length()){
				palindrome=s1[i];
			}
	}
	System.out.println(palindrome);
}
}
