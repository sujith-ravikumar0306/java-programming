package ClassesAndObjects;

public class fractionClass {
    
    int numerator;
    int denominator;

    fractionClass(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void print()
    {
        System.out.println(numerator+"/"+denominator);
    }

    private void simplify()
    {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);

        for(int i=0;i<=smaller;i++)
        {
            if(numerator%i==0 && denominator%i==0)
            {
                gcd=i;
            }
        }

        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }

    public void iterator()
    {
        numerator = numerator+denominator;
        simplify();
    }
}
