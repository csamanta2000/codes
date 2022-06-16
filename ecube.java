package codes;
import java.util.Scanner;

public class ecube {

	public static void main(String[] args) {
		   Scanner sc= new Scanner(System.in);
		

		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();
		        int cube;
		        if(num % 2 == 0)
		        { System.out.println(num + " is even");
		        cube = num*num*num;
		        System.out.println("Cube of "+cube+" is:"+cube);
		        }
		       
		    }
}
		
	


