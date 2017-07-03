package guvi;

import java.util.Scanner;

public class RemoveSubsequence {
	public static void main(String[] args){
		String str;
		String tmp2="";
		String tmp="";
		String tmp1="";
		String str1="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		str=s.nextLine();
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(i!=j){
				if(ch[i]==ch[j]){
					ch[j]='\0';
				}
			}
			}
		}
		for(int i=0;i<str.length();i++){
			if(ch[i]!='\0'){
			tmp+=ch[i];
			}
		
		}
		for(int j=0;j<str.length()-3;j++){
for(int i=0;i<tmp.length();i++){
			tmp1=tmp.substring(i,tmp.length());
			str1=str.substring(j,j+tmp1.length());
			if(str1.equals(tmp1)){
				tmp2=str1;;
				break;
			}
		}
	}
		System.out.println(tmp2);
	}
	}
	

