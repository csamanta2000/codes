package codes;

import java.util.Scanner;

class arithmatic_function {
	public static void main(String[]args)
	{
		accept();
	}
	public static  void accept() {
		int a,b;
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("number of a"+a);
		System.out.println("number of a"+a);
		arithmatic(a,b);
	}
	
		public static  void arithmatic(int a,int b) {
			System.out.println("the sum is"+(a+b));
			System.out.println("the subtract is"+(a-b));
			System.out.println("the multiply is"+(a*b));
			System.out.println("the modulas is"+(a%b));
			System.out.println("the divide is"+(a/b));
		

		
		}
		}
