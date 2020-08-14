// WAP to input 2 numbers and find the sum using numeric method of the scanner class
import java.util.Scanner;
public class Q7
{
    public static void main (String args[])
    {
        System.out.println("Input first number: ");
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        System.out.println("Input second number: ");
        int num2=scan.nextInt();
        int num3=num1+num2;
        System.out.println(num3);
    }
}