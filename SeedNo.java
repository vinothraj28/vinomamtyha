package guvi;

import java.util.Scanner;

public class SeedNo {
    public static void main(String[] a)
    { 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=in.nextInt();
        int temp=num;
        int Mul=num;
        System.out.println("Enter the seednum:");
        int seedno=in.nextInt();
        while(temp>0){
        	int rem=temp%10;
            Mul*=(rem);
            temp=temp/10;
 }
        if (seedno==Mul)
        {
            System.out.println("  the number is a seed number ");
        }
        else
            System.out.println(" is not a seed number");
        in.close();
    }
}
