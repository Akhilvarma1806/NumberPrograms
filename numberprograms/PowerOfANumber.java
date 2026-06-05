package numberprograms;

import java.util.Scanner;

public class PowerOfANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base value");
		int base=sc.nextInt();
		System.out.println("enter power value");
		int power=sc.nextInt();
		int ans=1;
		for(int i=1;i<=power;i++) {
			ans=ans*base;
		}
		System.out.println(ans);}
}
