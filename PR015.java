package guvi;

import java.util.Scanner;

public class PR015 {
	public static void main(String[] args){
	       
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String[] binary = new String[25];
        int[] a=new int[n];
        int[] num=new int[n];
        int[] count=new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++){
        	a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
        	int temp4=a[i];
        if(temp4==0){
        	System.out.println(0);
        }else{ binary[i]="";
			       while (temp4 > 0) {
	    	   int rem = temp4 % 2;
	    	    binary[i]= rem+binary[i] ;
	           temp4 = temp4 /2;
	       }
        }       
        }
	       for(int i=0;i<n;i++){
	    	   num[i]=Integer.parseInt(binary[i]);
	    	   int temp0=num[i];
	    	   while(temp0>0){
	    	   int rem=temp0%10;
	    	   if(rem==1){
	    		   count[i]++;
	    	   }
	    	   temp0=temp0/10;
	    	   }
	       } 
	      for(int i=0;i<n;i++){
	    	   for(int j=0;j<n;j++){
	    	   if(count[i]>count[j]){
	    		   int temp=a[i];
	    		   a[i]=a[j];
	    		   a[j]=temp;
	    		   int temp2=count[i];
	    		   count[i]=count[j];
	    		   count[j]=temp2;
	    	   }else if(count[i]==count[j]){
	    		   if(a[i]>a[j]){
	    			   int temp3=a[i];
	    			   a[i]=a[j];
	    			   a[j]=temp3;
	    		   }
	    	   }
	    	   }
	       }
	       for(int i=0;i<n;i++){
	    	   System.out.println(a[i]);
	       }
	       s.close();
	   }

}
