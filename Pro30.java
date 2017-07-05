package guvi;

import java.util.Scanner;

public class Pro30 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int count=0;
		int num = 0;
		System.out.println("Enter the number of prisoners");
		int Prisoners = in.nextInt();
		int temp=Prisoners;
		int[] cell=new int[Prisoners];
		for(int i=0;i<cell.length;i++){
			cell[i]=i+1;
		}
		while(temp>0){
			count=0;
			System.out.println("Enter the prisoner to release:");
			int releaseprisoner=in.nextInt();
		for(int i=0;i<Prisoners;i++){
			if(releaseprisoner==cell[i]){
				cell[i]=0;
				num=i;
				temp--;
				}
		}
		for(int i=num+1;i<cell.length;i++){
			if(cell[i]!=0){
				count++;
			}else if(cell[i]==0){
				break;
			}
		}
		for(int i=num-1;i>=0;i--){
			if(cell[i]!=0){
				count++;
			}else if(cell[i]==0){
					break;
				}
			}
	System.out.println("Least no of gold coins we need to give: "+count +" gold coins");
		}
		in.close();
		}
}
