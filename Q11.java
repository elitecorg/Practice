// WAP to find the sum of the following series till n: S=(1)+(1+2)+(1+2+3)+...+(1+2+3+...+n).
public class Q11
{
    public void compute(int n)
    {
        int sum=0;
        int m = n;
        for(int i=1;i<=n;i++,m--)
        {
            sum+=i*m;
        }
        System.out.println("The answer is "+sum);
    }
    public static void main (String args[])
    {
        Q11 obj=new Q11();
        obj.compute(4);
    }
}