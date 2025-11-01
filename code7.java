// Arthimatic Opertaion
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
      //Arthimatic Operator : +,-,*,%,/
       int a,b;

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter your Number");

       a = sc.nextInt();
       b = sc.nextInt();

       System.out.println("Addation + = "+(a+b));
       System.out.println("Subtraction -="+(a-b));
       System.out.println("Multiply * ="+(a*b));
       System.out.println("Division / ="+(a/b));
       System.out.println("Modu % ="+(a%b));



    }
}
