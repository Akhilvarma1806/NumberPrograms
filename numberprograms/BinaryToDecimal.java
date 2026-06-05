package numberprograms;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int bin=sc.nextInt();
		int dec=0;int i=1;
		while(bin!=0) {
			int rem=bin%10;
			dec+=rem*i;
			bin/=10;
			i*=2;
		}
		System.out.println("Decimal value is: "+dec);

	}

}
