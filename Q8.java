// Design a class to input name, zodiac sign, weight and lucky number
import java.util.Scanner;
public class Q8
{
    void info()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter your Zodiac sign: ");
        String zodiac = scan.nextLine();
        System.out.println("Enter your weight: ");
        double weight = scan.nextDouble();
        System.out.println("Enter your lucky number: ");
        int luckyNum=scan.nextInt();
        System.out.println("Your name is  "+name);
        System.out.println("Your Zodiac sign is "+zodiac);
        System.out.println("Your weight is "+weight);
        System.out.println("Your lucky number is "+luckyNum);
    }
}