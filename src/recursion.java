// Recursion is the concept of calling of a function by itself.
// This may look like an infinite loop.
// A base condition is used to terminate recursive calls at an instance of time.

public class recursion{

    //count numbers in increasing order
    static int min=1;
    public static void countNum(int n)
    {   
        if(min<=n)
        {
            System.out.println(min++);
            countNum(n);
        }    
        
    }


    //print the numbers until -5 in reverse order
    public static int recursiveFunction(int n)
    {
        if(n<=-5)   //termination (base condition)
        {
            System.out.println("Maximum limit reached!");
            return 0;
        }

        System.out.println("The number is: "+n);
        return recursiveFunction(n-1);
    }

    //Count number of digits in an integer
    public static int findDigits(int n) 
    {
        
        if(n>=9)
        {
            return 1;
        } 
        
        int carry = findDigits(n/10);
        int digits = carry + 1;

        return digits;
        
    }


    public static void main(String args[])
    {
        int n=12;
        //recursiveFunction(n);
        System.out.println("No. of digits: "+findDigits(n));
        countNum(n);

    }
}