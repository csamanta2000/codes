package codes;

import java.util.*;                                                 
public class profit_loss                                           
{
    public static void main(String args[])  {                        
        Scanner sc = new Scanner(System.in);                       
        int sp,cp,profit,loss;                                     
        System.out.println("Enter The Selling ");  
        sp = sc.nextInt();                                         
        System.out.println("Enter The Cost Price ");
        cp = sc.nextInt();
        if (sp>cp)                                                  
        {
            profit = sp - cp;                                       
            System.out.println("Profit is:"+profit);       
        }
        else if(cp>sp)
        {
            loss = cp - sp;
            System.out.println("Loss is:"+loss);
        }
        else
        {
            System.out.println("Neither Profit Nor Loss");
        }
    }
}