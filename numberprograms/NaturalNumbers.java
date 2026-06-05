package numberprograms;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value ");
		int n=sc.nextInt();
		//for sum of n natural numbers
//		int sum=0;
//		for(int i=1;i<=n;i++) {
//			sum+=i;
//		}
//		System.out.println("the sum of "+n+ " natural numbers is: "+sum);
//			
//		
		//to print n natural numbers
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	
	}

}
