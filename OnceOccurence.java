package guvi;

import java.util.Scanner;

public class OnceOccurence {
	public static void main(String[] args){
		int n;
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the integers :");
		n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			count=1;
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					count++;
					a[j]='\0';
				}
			}if(count==1 && a[i]!=0){
			System.out.println(a[i]);
		
			}
			}
		
	}

}
