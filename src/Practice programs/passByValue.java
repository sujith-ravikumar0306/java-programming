//package Practice programs;

public class passByValue {

    public static void passByVal(int a ,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a in function :" +a);
        System.out.println("b in function :" +b);
    }
    public static void main(String[] args) {
        int a=10;
        int b=12;
        passByVal(a, b);
        System.out.println("a in main :" +a);
        System.out.println("b in main :" +b);

    }
}
