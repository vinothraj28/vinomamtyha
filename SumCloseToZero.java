package guvi;

import java.util.Scanner;

public class SumCloseToZero {
	public static void main(String[] args){
		int n,h = 0,g = 0;
		int m=0;
		int min=99999;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the integers :");
		n=s.nextInt();
		int[] sum=new int[100];
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				if(i!=j){
				sum[m++]=a[i]+a[j];
				for(int k=0;k<m;k++){
					if(sum[k]<min){
						min=sum[k];
						h=a[i];
						g=a[j];
					}
			}
		}
		}

}
	System.out.println(h+"+"+g+"="+min);
s.close();
}
}