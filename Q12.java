// WAP to find the sum of the following series till n: S=1-2+3-4+...n terms.
public class Q12
{
    public void compute(int n)
    {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            if(i%2==1)
            {
                sum+=i;
            }
            else
            {
                sum-=i;
            }
        }
        System.out.println(sum);
    }
    public static void main (String args[])
    {
        Q12 obj=new Q12();
        obj.compute(7);
    }
}