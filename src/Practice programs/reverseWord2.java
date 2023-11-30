
/* reversing each word of a string - STACK Application */

import java.util.Scanner;

public class reverseWord2 {

    public static String reverseString(String str)
    {
        int len= str.length();
        String res="";
        if(len<=1)
        {
            System.out.println("Enter alteast two characters!");
            return res;
        }
        
            char stack[] =new char[100]; 
            int top=-1;

            for(int i=0;i<len;i++)
            {
                if(str.charAt(i)!=' ')
                {
                    stack[++top]=str.charAt(i);
                }
                else
                {
                    while (top!=-1) 
                    {
                        res+=stack[top--];   
                    }
                    res+=" ";
                }
            }
             while (top!=-1) 
            {
                res+=stack[top--];   
            }

        return res;
    }

    public static void main(String[] args) {
        
        System.out.print("Enter a string to reverse words: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        System.out.println(reverseString(str));

    }
    
}
