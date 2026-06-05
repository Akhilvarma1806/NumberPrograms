package numberprograms;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int total_sum=0;
		
		int num=n;
		while(n!=0) {
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact*=i;
			}
				total_sum+=fact;
			
			n=n/10;
		}
		if(num==total_sum) {
			System.out.println("given number is strong");
		}
		else {
			System.out.println("given number is not strong");
		}
	}

}
