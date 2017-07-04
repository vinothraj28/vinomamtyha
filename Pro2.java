package guvi;
import java.util.Scanner;
public class Pro2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input :");
		int input=in.nextInt();
		System.out.println("Enter the no of digits to delete:");
		int k=in.nextInt();
		String str=""+input;
		String output = "";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			for(int j=0;j<ch.length;j++){
			if(ch[i]<ch[j]){	
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
			}
			}
		for(int i=0;i<k-1;i++){
			output+=ch[i];
		}
		int outputvalue=Integer.parseInt(output);
		System.out.println(outputvalue);
		in.close();
	}
}
