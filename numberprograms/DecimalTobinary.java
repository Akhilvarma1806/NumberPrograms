package numberprograms;

import java.util.Scanner;

public class DecimalTobinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int bin=0;int i=1;
		while(n!=0) {
			int rem=n%2;
			bin+=rem*i;
			n=n/2;
			i*=10;
		}
		System.out.println("Binary value is: "+bin);
	}

}
