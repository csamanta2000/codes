package codes;

import java.util.Scanner;
/*WAP To Accept Student Name,Roll No. And Marks Of 5 Subjects
And Then Calculate Percentage And Display The Output*/
import java.util.Scanner;
public class rcard
{
    public static void main(String args[])

{
    int n1,n2,n3,n4,n5,rollno;
    String name;
    float percent;
    Scanner s1 = new Scanner(System.in); 
    System.out.println("Enter Your Name:"); 
    name = s1.nextLine(); 
    System.out.println("Enter Your Roll No. :");
    rollno= s1.nextInt();
    System.out.println("Enter Your Marks of 1st Subject :");
    n1 = s1.nextInt();
    System.out.println("Enter Your Marks of 2nd Subject :");
    n2 = s1.nextInt();
    System.out.println("Enter Your Marks of 3rd Subject :");
    n3 = s1.nextInt();
    System.out.println("Enter Your Marks of 4th Subject :");
    n4 = s1.nextInt();
    System.out.println("Enter Your Marks of 5th Subject :");
    n5 = s1.nextInt();
    percent = ((n1+n2+n3+n4+n5)*100)/500;
    System.out.println("Name :"+name);
    System.out.println("Roll No. :"+rollno);
    System.out.println("Marks of 1st Subject:"+n1);
    System.out.println("Marks of 2nd Subject:"+n2);
    System.out.println("Marks of 3rd Subject:"+n3);
    System.out.println("Marks of 4th Subject:"+n4);
    System.out.println("Marks of 5th Subject:"+n5);
    System.out.println("Percentage of marks:"+percent);
}
}
