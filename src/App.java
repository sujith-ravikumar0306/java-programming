//import java.util.*;

public class App {
    public static void main(String[] args) throws Exception 
    {
        //creating a scanner object
        //Scanner sc = new Scanner(System.in);

        System.out.println("Hello, World!");
        /*String s = new String();
        System.out.println("Enter a string: ");
        s=sc.nextLine();
        System.out.println("The string you entered : ");
        System.out.println(s);*/

        int a=5;    // 00000101
        int b=10;   // 00001010

       /* //manipulation in pre/post - increment/decrement
        if(a == a++){System.out.println("Equals and modified");}else{System.out.println("Not equal and modifies");}
        if(b == ++b){System.out.println("Equal and modified");}else{System.out.println("not equal and modified");} */

        //bitwise operators
        System.out.println(a&b); //AND - 00000000
        System.out.println(a|b); //OR  - 00001111
        System.out.println(a^b); //XOR - 00001111
        System.out.println(~a);  //NOT - 11111010
        System.out.println(a<<4); //left shift - 00010100
        System.out.println(a>>2); //right shift - 00000001

        int i;
        for(i=0;i<5;i++);
        System.out.println(i);
    }
}
    