package numberprograms;

import java.util.Scanner;

public class ReadLastDigit {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		while(n!=0) {
			int rem=n%10;
			System.out.println(rem);
			n=n/10;
		}
	}
	

}
