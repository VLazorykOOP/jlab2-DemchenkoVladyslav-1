import static java.lang.Math.min;

public class Math {
    public static int maxDiv(int a, int b)
    {
        int n = min(a,b);
        for (int i = n;i>=1;i--)
        {
if (a%i==0 && b%i==0)return i;
        }
        return 1;
    }
    public static int minKrat(int a, int b)
    {
        int n = min(a,b);
        for (int i = 1;i<=n;i--)
        {
            if (a%i==0 && b%i==0)return i;
        }
        return 1;
    }
}
