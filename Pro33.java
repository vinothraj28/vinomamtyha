package guvi;

import java.util.Scanner;

public class Pro33 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
        String max = "aaaa";
		int n=0;
		String[] a= new String[20];
		int len  = s.length();
		int m =0;
		for(int i=0;i<=len-1;i++){
			for(int j=i+1;j<=len;j++){
			String s1 = s.substring(i,j);
		 m=s1.compareTo(s);
		 if(m>1 ){
			 a[n++] = s1;
		 }
			}
		}
		for(int i=0;i<n;i++){
			int k = a[i].compareTo(max);
			if(k>0){
				max=a[i];
			}
		}
		if(max!="aaaa"){
		System.out.println(max);
		}else{
			System.out.println("Not Possible");
		}
		in.close();
		}
}
