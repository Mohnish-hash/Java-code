// Assignment operation
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
      // Assignment Operation : =,+=,-+,*=,/=,%=
       int a,b;

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter your Number");

       a = sc.nextInt();
       b = sc.nextInt();

       System.out.println("="+(a=b));
       System.out.println("+="+(a+=b));
       System.out.println("-="+(a-=b));
       System.out.println("*="+(a*=b));
       System.out.println("/="+(a/=b));
       System.out.println("%="+(a%=b));
       




    }
}
