// WAP to find the sum of n terms of the following series: S=1+2+3+4+5+...+n.
public class Q9
{
    public void calc(int n)
    {
        int sum =0;
        for (int i=1;i<=n;i++)
        {
          sum += i;
        }
        System.out.println(sum);
    }
    public static void main (String args[])
    {
        Q9 obj1=new Q9();
        obj1.calc(10);
    }
}