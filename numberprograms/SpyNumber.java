package numberprograms;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int sum=0;int prod=1;
		while(n!=0) {
			int rem=n%10;
			sum+=rem;
			prod*=rem;
			n=n/10;
		}
		if(sum==prod) {
			System.out.println("given number is a SPY");
		}
		else {
			System.out.println("given number is Not a SPY");
		}
			//if the sum and product of each digit in the number is
//			same then it is said to be a SPY number
	}

}
