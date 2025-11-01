// Switch Statement
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
       int a,b,c,x;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number");
       a = sc.nextInt();
       b = sc.nextInt();

       System.out.println("Enter Your Choice(1:Add , 2:Subtract , 3:Multiply , 4:Division)");
       x = sc.nextInt();


       switch(x)
       {
       case 1:
         c = a+b;
         System.out.println("Sum"+c);
         break;

       case 2:
         c = a-b;
         System.out.println("Sum"+c);
         break;

       case 3:
         c = a*b;
         System.out.println("Sum"+c);
         break;

       case 4:
         c = a/b;
         System.out.println("Sum"+c);
         break;  

      default:
         System.out.println("Invalid cases");




       }
    }
}
