// WAP to find the sum of the following series till n: S=2!-4!+6!-8!+...n terms.
public class Q13
{
    public void compute(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            int k=2*i;
            if(k%4==2)
            {
                int fact=1;
                for(int j=k;j>0;j--)
                {
                    fact*=j;
                }
                sum+=fact;
            }
            else
            {
                int fact=1;
                for(int j=k;j>0;j--)
                {
                    fact*=j;
                }
                sum-=fact;
            }
        }
        System.out.println(sum);
    }
    public static void main (String args[])
    {
        Q13 obj=new Q13();
        obj.compute(4);
    }
}