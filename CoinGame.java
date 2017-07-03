package guvi;

import java.util.Scanner;

public class CoinGame {
	public static void main(String[] args){
		int player1=0;
		int player2=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i+=2){
			player1+=a[i];
		}for(int i=1;i<n;i+=2){
			player2+=a[i];
		}
		if(player1>player2){
			System.out.println("player1 wins" +player1);
		}else{
			System.out.println("player2 wins" +player2); 
		}
		s.close();
	}
	}
