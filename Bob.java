package guvi;

import java.util.Scanner;

public class Bob {
	public static void main(String[] args){
		int value=3;
		int num;
		int temp=3;
		int i;
		int[] a=new int[100];
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for( i=1;i<100;i++){
			if(value>0){
				a[i]=value;
				//System.out.println(+value);
				value--;
			}else if(value==0){
				value=temp*2;
	             a[i]=value;
	             value--;
				}
		}
		i=num;
		System.out.println(a[i]);
		
		}
	}


