/* Recursion */

/* Sujith's family tree is grown in by the following conditions.
 * A male gives birth to a male first and a female next.
 * A female gives birth to a female first and then to a male.
 * If Sujith(Male) is the first generation in his family, write a program to find the gender of the
   Nth child in Kth generation.
 */

/**
 * familyTree
 */

import java.util.*;

public class familyTree {

    public static char findGender(char root_gender, int generation, int child)
    {

        if(generation==1)
        {
            return root_gender;
        }
        
        int numChildrenInNthGen = (int) Math.pow(2,(generation-1));

        if( generation <= numChildrenInNthGen/2 )
        {
            return findGender(root_gender, generation-1, child);
        }
        else
        {
            char new_root_genderder ='m';
            if( root_gender == 'm')
            {
                new_root_genderder='f';
            }
            return findGender(new_root_genderder, generation-1, child-(numChildrenInNthGen/2));
        }
    }

    public static void main(String[] args) {
        /*
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first generation member's gender(m/f) :");
        char root_gender = sc.next().charAt(0);
        System.out.print("Enter the generation: ");
        int gen= sc.nextInt();
        System.out.print("Enter the child:");
        int child = sc.nextInt();
        sc.close();

        System.out.print("The gender of the child is :");
        System.out.println(findGender(root_gender, gen, child));

         */
        System.out.println(findGender('m', 3, 3));
    }
}