// WAP to find the sum of the following series till n: S=1+x+x^2+x^3+...+x^n.
public class Q10
{
    public void compute(int n, int x)
    {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum+=Math.pow(x,i);
        }
        System.out.println("The answer is "+sum);
    }
    public static void main(String args[])
    {
        Q10 obj=new Q10();
        obj.compute(5,2);
    }
}