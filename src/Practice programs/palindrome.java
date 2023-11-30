/**
 * palindrome
 */

 import java.util.*;

public class palindrome {

    public static boolean findPalin(String str)
    {
        int s = 0, e= str.length()-1;
        while(s<e)
        {
            if(str.charAt(s)== str.charAt(e))
            {
                s++;
                e--;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to check if palindrome: ");
        String str = sc.next();
        sc.close();

        System.out.println(findPalin(str));
      
    }
}