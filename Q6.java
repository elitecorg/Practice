// WAP to compute telegram charges
public class Q6
{
    public void charges(int words)
    {
        if(words <=15)
        {
            System.out.println("The price is 5 rs.");
        }
        else
        {
            int k = words - 15;
            System.out.println("The price is "+(5+k)+" rs.");
        }
    }
    public static void main(String args[])
    {
        Q6 obj1=new Q6();
        obj1.charges(45);
    }
}