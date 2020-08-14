// WAP to count the number of digits of a number entered by a user.
public class Q15
{
    public void compute(int n)
    {
        int temp,count=0,k;
        while (n>0)
        {
            k=n%10;
            n-=k;
            n/=10;
            count++;
        }
        System.out.println(count);
    }
    public static void main (String args[])
    {
        Q15 obj=new Q15();
        obj.compute(36483);
    }
}