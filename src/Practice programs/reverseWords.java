//package Practice programs;

import java.util.*;

public class reverseWords {


    public static String reverseWord(String str)
    {
        int len= str.length();

        String res="";
        int start=0,end=0;
        int i;
        for(i=0;i<len;i++)
        {
            if(str.charAt(i)=='\0'|| str.charAt(i)==' ')
            {
                    end=i-1;
                    String currRev="";
                    for(int j=end;j>=start;j--)
                    {
                        currRev+=str.charAt(j);
                    }
                    res+=currRev+ " ";
                    start=i+1;
            }
        }

        end=len-1;
                    String currRev="";
                    for(int j=end;j>=start;j--)
                    {
                        currRev+=str.charAt(j);
                    }
                    res+=currRev+ " ";

        return res;
    }

    public static void main(String[] args) {

        System.out.print("Enter string to reverse each word: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        System.out.println(reverseWord(str));
    }
        
}
