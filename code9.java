// Logical Operation
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
      // Logical Operation : &&and ,||or ,!not
       int a,b;

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter your Number");

       a = sc.nextInt();
       b = sc.nextInt();

       System.out.println("&&"+(a>b && a<b)); // any condition false then output false
       System.out.println("||"+(a<b || a>b)); // any condition True than output Ture
       System.out.println("!"+(a>=b && b>a)); // condition false then output change true
     
       




    }
}
