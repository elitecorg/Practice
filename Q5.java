// WAP to calculate the telephone bill
public class Q5
{
    public void calculate(int ncalls)
    {
        if ((ncalls>=0)&&(ncalls<=100))
        {
            System.out.println("The telephone bill will be 100 rs.");
        }
        else if ((ncalls>100)&&(ncalls<=150))
        {
            double k = (ncalls - 100)*2;
            System.out.println("The telephone bill will be "+(100+k)+" rs.");
        }
        else
        {
            double k = (ncalls - 100 - 50)* 2.5;
            System.out.println("The telephone bill will be "+(200+k)+" rs.");
        }
    }
    public static void main(String args[])
    {
        Q5 obj1=new Q5();
        obj1.calculate(263);
    }
}