//WAP that displays the absolute value of a variable using ternary operator
public class Q4
{
    public void check(int i)
    {
        int k = (i<0)?(-i):(i);
        System.out.println("The absolue value is "+k);
    }
    public static void main (String args[])
    {
        Q4 obj1=new Q4();
        obj1.check(-4);
    }
}