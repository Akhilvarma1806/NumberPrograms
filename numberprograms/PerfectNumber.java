package numberprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(n==sum) {
			System.out.println("Given number is a Perfect Number");
		}
		else {
			System.out.println("Given number is Not a Perfect Number");
		}

	}

}
