package guvi;

import java.util.Scanner;

public class SumOFArray {
	public static void main(String[] args){
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the integers :");
		n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			for( int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					if(a[i]+a[j]==a[k]){
						System.out.println(a[i]+"+"+a[j]+"+="+a[k]);
					}
				}
			}
		}
 }
}