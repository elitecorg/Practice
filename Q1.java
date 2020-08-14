// WAP to define a class to accept a students name, percentage and then determine the grade(A, B, C, D)
public class Q1
{
    void displayGrade(String name, double percent)
    {
        System.out.println("Students name "+name);
        System.out.println("Percentage obtained is "+percent);
        if((percent>=80)&&(percent<=100))
        {
            System.out.println("Grade obtained is A");
        }
        else if(percent>=60)
        {
            System.out.println("Grade obtained is B");
        }
        else if(percent>=50)
        {
            System.out.println("Grade obtained is C");
        }
        else if(percent>=0)
        {
            System.out.println("Grade obtained is D");
        }
        else
        {
            System.out.println("Invalid percentage entered!");
        }
    }
}