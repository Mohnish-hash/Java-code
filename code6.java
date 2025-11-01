// print name,age,salar
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
       String name;
       int age;
       float salary;

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter your name ");
       name = sc.nextLine();
       System.out.println("Enter your age ");
       
       age = sc.nextInt();
       System.out.println("Enter your salary ");
       salary = sc.nextFloat();

       System.out.println("My name is "+name);
       System.out.println("MY age "+age);
       System.out.println("My salary"+salary);

    }
}
