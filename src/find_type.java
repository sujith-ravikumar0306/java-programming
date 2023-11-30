public class find_type {

    public static class student{
        int rollno;
        String name;
        void moto(){
            System.out.println("Fear Nothing!");
        }
    }
    
    public static void findType(int x)
    {
        System.out.println("The variable is of type int.");
    }
    public static void findType(float x)
    {
        System.out.println("The variable is of type float.");
    }
    public static void findType(double x)
    {
        System.out.println("The variable is of type double.");
    }
    public static void findType(byte x)
    {
        System.out.println("The variable is of type byte.");
    }
    public static void findType(String x)
    {
        System.out.println("The variable is of type string.");
    }
    public static void findType(Character x)
    {
        System.out.println("The variable is of type character.");
    }

    public static void main(String args[])
    {
        int num=10;
        Character ch=12;
        double lf=12.3;
        String str="This is a string!";

        student st = new student();

        findType(num);
        findType(ch);
        findType(lf);
        findType(str);
        System.out.println(st.getClass().getName());
        
    }
}
