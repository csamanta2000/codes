package codes;
import java.util.*;                                
public class vowels                        
{
    public static void main(String args[])     
    {
        Scanner s1 = new Scanner(System.in);        
        char ch;                                    
        System.out.println("Enter Any Character:"); 
        ch = s1.next().charAt(0);                   
        switch (ch)                                 
        {
            case 'a' :                              
                System.out.println("It Is A Vowel");
                break;                              
            case 'e' :
                System.out.println("It Is A Vowel");
                break;
            case 'i' :
                System.out.println("It Is A Vowel");
                break;
            case 'o' :
                System.out.println("It Is A Vowel");
                break;
            case 'u' :
                System.out.println("It Is A Vowel");
                break;
            case 'A' :
                System.out.println("It Is A Vowel");
                break;
            case 'E' :
                System.out.println("It Is A Vowel");
                break;
            case 'I' :
                System.out.println("It Is A Vowel");
                break;
            case 'O' :
                System.out.println("It Is A Vowel");
                break;
            case 'U' :
                System.out.println("It Is A Vowel");
                break;
            default:                                   
                System.out.println("It Is Not A Vowel");
        }

    }
}