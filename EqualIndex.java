package guvi;

import java.util.Scanner;

public class EqualIndex {
	public static void main(String[] args){
		int m = 0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the array Elements:");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++){
		
			if(i==a[i]){
				System.out.println(i);
			}
		}
	}

}
