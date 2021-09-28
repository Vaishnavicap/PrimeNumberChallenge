//check if any given input number is prime or not. 


package primenumbers;
import java.util.Scanner;


public class PrimeNumbers {


    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number : ");        
        int n = input.nextInt();
        
        if(n==2)
            {
                System.out.println(n + " is a Prime number.");                
            }
        else if(n==0 || n==1)
            {
                System.out.println(n + " is not a Prime number.");                
            }
        else if(n<0)
        {
            System.out.println(n + " is Invalid number.");
        }
       
        /*Here i = 2 because n%0 is undefined and 
        n%1 will give reminder as zero so 'if' condition won't work as required*/
        for(int i = 2 ; i < n ;i++)
        {
            /*If any value in range 2 to n-1 is divisible by n
            and reminder is zero then n is not a prime number*/
            if(n%i==0)
            {
                System.out.println(n + " is not a Prime number.");
                break;
            }
            /*If any value in range 2 to n-1 is not divisible by n 
            and if i+1 = n then n is a prime number*/
            else if(i+1==n)
            {
                System.out.println(n + " is a Prime number.");
                break;
            }
                      
        }
      
    }
    
}
