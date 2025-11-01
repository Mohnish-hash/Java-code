//Exception Arithematic
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        try
        {
            int a,b,c;
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println("Do not enter zero this is invaild");

        }        
        
    }
}
