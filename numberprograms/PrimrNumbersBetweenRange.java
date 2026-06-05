package numberprograms;

import java.util.Scanner;

public class PrimrNumbersBetweenRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter lowerRange");
		int low=sc.nextInt();
		System.out.println("enter highRange");
		int high=sc.nextInt();
		for(int i=low;i<=high;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}

	}

}
