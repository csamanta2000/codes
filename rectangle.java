package codes;
import java.util.Scanner;
public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1= new Scanner(System.in);
		int l,b,perimeter,area;
		System.out.println("enter details");
		System.out.println("enter lenght");
		l=s1.nextInt();
		System.out.println("enter breath");
		b=s1.nextInt();
		perimeter = 2*(l+b);
		System.out.println("perimeter is:"+perimeter);
		area= (l*b);
		System.out.println("area is:"+area);
		
		
		
	}

}
