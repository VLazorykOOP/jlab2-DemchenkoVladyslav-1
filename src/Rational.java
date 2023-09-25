
public class Rational
{
    public int numerator;
    public int denominator;

    public Rational()
    {
        numerator = 1;
        denominator = 1;
    }

    public Rational(int a, int b)
    {
        numerator = a;
        if (b != 0) denominator = b;
        else b = 1;
        reduce();
    }

    public void show()
    {
        System.out.println(numerator + "/" + denominator);
    }

    public void reduce()
    {
        if (numerator < 0 && denominator < 0)
        {
            numerator = -numerator;
            denominator = -denominator;
        }
        if (numerator == denominator)
        {
            numerator = 1;
            denominator = 1;
            return;
        }
        for (int i = Math.min(Math.abs(numerator), Math.abs(denominator)); i > 1; i++)
        {
            if ((numerator % i == 0) && (denominator % i == 0))
            {
                numerator /= i;
                denominator /= i;
                return;
            }
        }
    }
    Rational subtraction(Rational rational)
    {
        numerator *= rational.denominator;
        numerator -= rational.numerator * denominator;
        denominator *= rational.denominator;
        reduce();
        return this;
    }

    Rational multiplication(Rational rational)
    {
        numerator *= rational.numerator;
        denominator *= rational.denominator;
        reduce();
        return this;
    }

    Rational division(int number)
    {
        denominator *= number;
        reduce();
        return this;
    }
    Rational subtraction(int number)
    {
        Rational rational = new Rational(number*number,number);
        numerator *= rational.denominator;
        numerator -= rational.numerator * denominator;
        denominator *= rational.denominator;
        reduce();
        return this;
    }

    Rational multiplication(int number)
    {
        numerator *= number;
        reduce();
        return this;
    }

    Rational division(Rational rational)
    {
        numerator *= rational.denominator;
        denominator *= rational.numerator;
        reduce();
        return this;
    }
    Rational addition(int number)
    {
        Rational rational = new Rational(number*number,number);
        numerator *= rational.denominator;
        numerator += rational.numerator * denominator;
        denominator *= rational.denominator;
        reduce();
        return this;
    }
    Rational addition(Rational rational)
    {
        numerator *= rational.denominator;
        numerator += rational.numerator * denominator;
        denominator *= rational.denominator;
        reduce();
        return this;
    }
}
