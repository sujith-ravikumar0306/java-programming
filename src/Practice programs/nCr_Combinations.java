/**
 * nCr_Combinations
 */
import java.util.*;

public class nCr_Combinations {

    public static long fact(int n)
    {
        long f=1;

        for(int i=1;i<=n;i++)
        {
            f*=i;
        }

        return f;
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.err.println("Enter n- value :");
        int n=sc.nextInt();
        System.err.println("Enter r- value :");
        int r=sc.nextInt();
        sc.close();

        long n_f = fact(n);
        long r_f = fact(r);
        long nr_f = fact(n-r);

        System.out.println(n_f);
        System.out.println(r_f);
        System.out.println(nr_f);

        long res= n_f/(r_f*nr_f);

       System.out.println("Combinations : " + res);
    }
}