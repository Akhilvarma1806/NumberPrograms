package numberprograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int rev=0; int num=n;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(num==rev) {
			System.out.println("Given number is a palindrome");
		}
		else {
			System.out.println("Given number is not a palindrome");
		}

	}

}
