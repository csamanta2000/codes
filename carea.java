package codes;

import java.util.Scanner;

public class carea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		float r,area,circum,PI=3.14F;
		System.out.println("enter radius");
		r= s1.nextInt();
		area = 3.14F*r*r;
		circum = 2 * 3.14F * r;
		System.out.println("area of circle"+area);
		System.out.println("circumfrence of circle"+circum);
	}

}
