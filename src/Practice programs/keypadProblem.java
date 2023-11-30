//package Practice programs;

/* A classical problem in recursion in finding the combinations that can be created using one alphabet
   belonging to the specific number in olden days keypad mobile phones.

   Eg:- If n= 23, all combinations in 2, 3 such as 'ad,ae,af,bd,be,bf,cd,ce,cf' must be returned as a string.
 */


 import java.util.Scanner;

public class keypadProblem {

    //The function to return the alphabets in a number
    public static String getAlpha(int n)
    {
        if(n==1)
        {
            return "";
        }
        if(n==2)
        {
            return "abc";
        }
        if(n==3)
        {
            return "def";
        }
        if(n==4)
        {
            return "ghi";
        }
        if(n==5)
        {
            return "jkl";
        }
        if(n==6)
        {
            return "mno";
        }
        if(n==7)
        {
            return "pqrs";
        }
        if(n==8)
        {
            return "tuv";
        }
        if(n==9)
        {
            return "wxyz";
        }
        return "";
    }

    public static String[] keypad(int n)
    {

        //The base case is that if the digit is zero it must return an empty string.
        if(n==0)
        {
            String[] output = new String[1];
            output[0]="";
            return output;
        }

        //let us find the unit digit and the remaining number
        int unit = n%10;
        int remainder = n/10;

        //call the recursion for the subproblems
        String[] smallOutput = keypad(remainder);

        //Let us get the alphabets available for a number using getAlpha() function
        String unitOptions = getAlpha(unit);

        //Let us create the larger output that will contain unit digit's alphabets multiplied with the small output
        String[] output = new String[smallOutput.length * unitOptions.length()];
        //now store the combinations into the output string
        int k=0;
        for(int i=0;i<unitOptions.length();i++)
        {
            for(int j=0;j<smallOutput.length;j++)
            {
                output[k++] =  smallOutput[j] + unitOptions.charAt(i);
            }
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number with digits 0-9: ");
        int n= sc.nextInt(); 
        sc.close(); 
        
        String[] output = keypad(n) ;

        for(int i=0;i<output.length;i++)
        {
            System.out.println(output[i]);
        }

    }
    
}
