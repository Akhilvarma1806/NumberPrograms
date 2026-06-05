package numberprograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int n=sc.nextInt();
		int num=n;
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		int exp=count;
		int tem=n;
		int sum=0;
		while(tem!=0) {
			int base=tem%10;
			int power=1;
			for(int i=1;i<=exp;i++) {
				power*=base;
			}
			sum+=power;
			tem/=10;
		}
		if(n==sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
	}

}
