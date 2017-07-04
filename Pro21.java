package guvi;

import java.util.Scanner;

public class Pro21 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array a:");
		int n= in.nextInt();
		int sum1=0;
		int sum2=0;
		int[] a=new int[n];
		int[] b=new int[n];
		int[] c=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<n/2;i++){
			sum1+=a[i];
			
		}
		for(int j=n/2;j<n;j++){
			sum2+=+a[j];
		}
		int len=Math.abs((n/2)-n);
		int avg1=sum1/(n/2);
		int avg2=sum2/len;
		if(avg1==avg2){
			System.out.println("The Spliited array B :");
			for(int i=0;i<(n/2)+1;i++){
				b[i]=a[i];
				System.out.println(b[i]);
			}
			System.out.println("The Splitted Array C");
			for(int j=0;j<len-1;j++){
				c[j]=a[j+len];
				System.out.println(c[j]);
			}
		}else{
			System.out.println("It is not possible");
		}
		
	}

}
