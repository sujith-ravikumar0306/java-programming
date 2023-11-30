//package Practice programs;

//Factorial of a number using recursion

import java.util.*;

public class fact_recursion {
    
     public static int findFact(int n) 
    {
        if(n==1)
        {
            return 1;
        }

        return n*findFact(n-1);
    }
    public static void main(String[] args) {
        
        System.out.println("Enter a positive number: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(findFact(n)); 
    }

   
}
