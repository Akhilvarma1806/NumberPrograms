package numberprograms;

public class SwappingWithoutVariable {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("Before Swapping a value:"+a);
	System.out.println("Before Swapping b value:"+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping a value:"+a);
	System.out.println("After Swapping b value:"+b);

	}

}
