//package Practice programs;

//input = "abc"
//output = a, ab, abc, b, bc, c
//Note: ac, ba, cb are all invalid. 

import java.util.*;

public class substring {

    public static void subString(String str)
    {
        int len = str.length();

        for(int i=0;i<len;i++)
        {
            String buffer="";
            for(int j=i;j<len;j++)
            {
                buffer+=str.charAt(j);
                System.err.println(buffer + ", ");
            }
        }


    }

    public static void main(String[] args) {
        
    System.out.print("Enter a string: ");
    Scanner sc= new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    subString(str);
     
    }

}
