package guvi;

import java.util.Scanner;

public class NumberConvert{
	public static void main(String[] args){
		int number ;
		String tmp="";
		String tmp1="";
		String tmp2="";
		String tmp3="";
		String tmp4="";
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		String str=String.valueOf(number);
		 for(int i=0;i<str.length();i++){
			 tmp+=(char)((str.charAt(i)-48)+96);
		 }
		 System.out.println(tmp);
		  if(str.length()>=3){
			 tmp1+=(char)((str.charAt(0)-48)+96);
			 int m=Integer.parseInt(str.substring(1,3));
			
		 
			 if(m<26){
				 tmp1+=(char)(m+96);
			 }else{
				 String str1=""+m;
				 for(int j=0;j<str1.length();j++){
					 
					 tmp1+=(char)((str1.charAt(j)-48)+96);
					 
				 }
			 }for(int i=3;i<str.length();i++){
			 tmp1+=(char)((str.charAt(i)-48)+96);			 
			 }
		 }
		  System.out.println(tmp1);
		  if(str.length()>=4){
		tmp2+=(char)((str.charAt(0)-48)+96);
		tmp2+=(char)((str.charAt(1)-48)+96);
		int m1=Integer.parseInt(str.substring(2,4));
		 if(m1<26){
			 tmp2+=(char)(m1+96);
		 }else{
			 String str1=""+m1;
			 for(int j=0;j<str1.length();j++){
				 
				 tmp2+=(char)((str1.charAt(j)-48)+96);
				 
			 }
		 }for(int i=4;i<str.length();i++){
		 tmp2+=(char)((str.charAt(i)-48)+96);			 
		  }
		  }
		  System.out.println(tmp2);
		  if(str.length()>=4){
			  int m2=Integer.parseInt(str.substring(0,2));
			  int m3=Integer.parseInt(str.substring(2,4));
				 if(m2<26){
					 tmp3+=(char)(m2+96);
				 }else{
					 String str1=""+m2;
					 for(int j=0;j<str1.length();j++){
						 
						 tmp3+=(char)((str1.charAt(j)-48)+96);
						 
					 }
				 }
				 if(m3<26){
					 tmp3+=(char)(m3+96);
				 }else{
					 String str1=""+m3;
					 for(int j=0;j<str1.length();j++){
						 
						 tmp3+=(char)((str1.charAt(j)-48)+96);
						 
					 }
				 }
				 for(int i=4;i<str.length();i++){
				 tmp3+=(char)((str.charAt(i)-48)+96);			 
				  }
		  }
		  System.out.println(tmp3);
		  if(str.length()>=2){
			  int m4=Integer.parseInt(str.substring(0,2));
				 if(m4<26){
					 tmp4+=(char)(m4+96);
				 }else{
					 String str1=""+m4;
					 for(int j=0;j<str1.length();j++){
						 
						 tmp4+=(char)((str1.charAt(j)-48)+96);
						  }
				 }for(int i=2;i<str.length();i++){
				 tmp4+=(char)((str.charAt(i)-48)+96);			 
				  }
			   }
		  System.out.println(tmp4);
		  s.close();
}
}