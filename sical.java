package codes;

import java.util.Scanner;

public class sical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
		Scanner s1 = new Scanner(System.in);
		float p,r,t,si;
		System.out.println("enter fields to calculate");
		System.out.println("enter the principal amount");
		p = s1.nextInt();
		System.out.println("enter the rate");
		r = s1.nextInt();
		System.out.println("enter the time");
		t = s1.nextInt();
		si= (p*r*t)/100;
		System.out.println("interst is:"+si);
	}

}
