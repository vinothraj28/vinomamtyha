package guvi;

import java.util.Scanner;

public class Pro61 {
public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int c=0;
       String input1 = in.next();
       String input2 = in.next();
       int len1 = input1.length();
       int len2 = input2.length();
       String output="";
    		   for(int i=0;i<len1;i++){
    			   c = input1.charAt(i);
    			   if(c>=97 && c<=112){
    			   c+=10;
    			   }else if(c>112 && c<=122){
    				   c=c+10-122;
    				   c=c+96;
    			   }
    		   output+=(char)c;
	 }
    		   output+=" ";
    		   for(int i=0;i<len2;i++){
    			   c = input2.charAt(i);
    			   if(i>=1 && i<=len2-2){

    			   if(c>=97 && c<=112){
    			   c+=10;
    			   }else if(c>112 && c<=122){
    				   c=c+10-122;
    				   c=c+96;
    			   }
    			   }
    		   output+=(char)c;
    		   }
    		   System.out.println(output);
    		   }
 }

