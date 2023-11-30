//package Practice programs;

/* Understanding recursion using Towers of Hanoi */
/* Refer 'recursion vs induction' and induction hypothesis to get more idea on how it is being solved */
/* The catch is to move N number of disks from a source rod to destination rod using auxillary rod */
/* The number of rods are constant, i.e, is equal to three. The number of disks may vary. */
/* As the number of disks increase, the time complexity increases exponentially */
/* If number of disks N=n, then the number of steps = (2^n)-1  */

import java.util.Scanner;

public class towerOfHanoi {

    static void towerofHanoi(int n, char source, char destination, char auxillary)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from rod " +  source + " to rod " + destination);
            return;
        }
        towerofHanoi(n-1, source, auxillary, destination);
        System.out.println("Move disk " + n + " from rod " +  source + " to rod " + destination);
        towerofHanoi(n-1, auxillary, destination, source);
    }
    
    public static void main(String[] args) {

        System.out.print("Enter the number of disks: ");
        Scanner sc = new Scanner(System.in);
        int disks = sc.nextInt();
        sc.close();

        towerofHanoi(disks, 'A', 'C', 'B');
        
    }
    
}
