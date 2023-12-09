/* Find the index whose sumation of left part and summation of right part is equal */
/* Input = [1,2,3,2,1] */
/* Output = 2 (index number) */

import java.util.*;

public class equillibrium {

    public static int equillibriumIndex(int arr[], int n)
    {
        int i=0, j=n-1;
        int lsum=arr[i], rsum=arr[j];

        while (i<j) 
        {
            if(lsum>rsum)
            {
                rsum+=arr[--j];
            }else{
                lsum+=arr[++i];
            }
            
        }
        if(lsum==rsum)
        {
            return i;
        }

        return -1;
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int res=equillibriumIndex(arr, n);
        
        if(res!=-1)
        {
            System.out.println("The equillibrium index is "+res);
        }else{
            System.out.println("No equillibrium index found!");
        }
    }

}
