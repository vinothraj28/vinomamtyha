package guvi;

import java.util.Scanner;

public class SumOFArray {
	public static void main(String[] args){
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		n=s.nextInt();
		System.out.println("Enter the integers :");
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			for( int j=i+1;j<n;j++){
				for(int k=j+1;k<n;k++){
					if(a[i]+a[j]==a[k]){
						System.out.println(a[i]+"+"+a[j]+"+="+a[k]);
					}
				}
			}
		}
 }
}
