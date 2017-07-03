package guvi;

import java.util.Scanner;

public class Substring {
public static void main(String[] args){
	String str1;
	String str2;
	Scanner s=new Scanner(System.in);
	str1=s.nextLine();
    str2=s.nextLine();
    String str3="";
    String str4="";
    boolean ans = false;
    for(int i=0;i<str1.length();i++){
    for(int j=0;j<str1.length()-i;j++){
    	str3=str1.substring(i,i+j+1);
    	 for(int k=0;k<str2.length();k++){
    		    for(int l=0;l<str2.length()-k;l++){
    		    	str4=str2.substring(k,k+l+1);
    		    	if(str3.equals(str4)){
    		    		ans=true;
    		    	}
    		    }
    	 }
    		}
    }
    if(ans==true){
    	System.out.println(ans);
    }
    s.close();
}
}
