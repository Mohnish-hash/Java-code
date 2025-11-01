// User import value and add
import java.util.Scanner ;
class user
{
    public static void main(String[] args)
    {
        int a,b;

        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Sum of two value is = "+(a+b));


    }
}
