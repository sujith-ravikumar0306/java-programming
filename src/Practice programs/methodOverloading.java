//package Practice programs;

//method overloading- same method with different or variable datatypes.
public class methodOverloading {

    public static int sum(int a, int b)
    {
        return a+b;
    }
    public static float sum(float a, float b)
    {
        return a+b;
    }
    public static double sum(double a, double b)
    {
        return a+b;
    }
    public static int sum(char a, char b)
    {
        return a+b;
    }
    
    public static void main(String[] args) {
        
        System.out.println(sum(5,3));
        System.out.println(sum(2.7f,3.4f));
        System.out.println(sum(5.6,3.2));
        System.out.println(sum('0','0'));
    }
    
}
