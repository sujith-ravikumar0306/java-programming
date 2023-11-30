import java.util.*;

public class patterns {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a num:");
        int num=sc.nextInt();
/*
        //inverted '*' triangle
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //inverted num triangle
        int num=0;
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(num++ +"   ");
            }
            System.out.println();
        }   

        //isoceles triangle
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }   

        //star triangle pattern
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=1 ;j<2*i && j<2*n ; j++)
            {
                    System.out.print('*');
            }
            System.out.println();
        }   

        //triangle of nums 
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            int val=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(val);
                val++;
            }
            val=2*i-2;
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(val);
                val--;   
            }
            System.out.println();
        }   */

        //diamond star pattern
        int m,n;
        for (m = 1; m <= num; m++) {
 
            for (n = 1; n <= num - m; n++) {
                System.out.print(" ");
            }
 
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
 
                     System.out.println();
        }
        
        for (m = num - 1; m > 0; m--) {
 
            for (n = 1; n <= num - m; n++) {
                System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}